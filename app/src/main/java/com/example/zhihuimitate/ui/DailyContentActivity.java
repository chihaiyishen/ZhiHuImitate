package com.example.zhihuimitate.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.icu.text.LocaleDisplayNames;
import android.preference.PreferenceManager;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.zhihuimitate.R;
import com.example.zhihuimitate.db.DailyContent;
import com.example.zhihuimitate.util.HttpUtil;
import com.example.zhihuimitate.util.Utility;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class DailyContentActivity extends AppCompatActivity {

    private ImageView dailyImageView;
    private WebView dailyWebView;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_content);
        init();
    }

    private void init() {

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        dailyImageView = (ImageView) findViewById(R.id.daily_images_view);
        dailyWebView = (WebView) findViewById(R.id.daily_content_text);

        Toolbar toolbar = (Toolbar) findViewById(R.id.daily_toolbar);
        Intent intent = getIntent();
        Integer dailyId = intent.getIntExtra("id",0);
        Log.d("gjg", "Init : " + dailyId);
        requestDialyContent(dailyId);

    }

    private void showDailyContent(DailyContent dailyContent) {
        String title = dailyContent.getTitle();
        String imageId = dailyContent.getImage();
        Log.d("gjg", "ShowDailyContent : " + imageId);
        String css = "<link rel=\"stylesheet\" href=\"file:///android_asset/src.css\" type=\"text/css\">";
        String html = "<html><head>" + css + "</head><body>" + dailyContent.getBody() + "</body></html>";
        html = html.replace("<div class=\"img-place-holder\">", "");
        Log.d("gjg", "showDailyContent : " + html);
        WebSettings webSettings = dailyWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        dailyWebView.loadDataWithBaseURL(null,html, "text/html", "utf-8", null);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbarLayout.setTitle(title);
        Glide.with(DailyContentActivity.this).load(imageId).into(dailyImageView);
    }

    public void requestDialyContent(final Integer dailtId) {
        String dailyContenUrl = "http://news-at.zhihu.com/api/4/news/" + dailtId;
        Log.d("gjg", dailyContenUrl);
        HttpUtil.sendOkHttpRequest(dailyContenUrl, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.d("gjg", "onFailure");
                        Toast.makeText(DailyContentActivity.this, "获取知乎信息失败", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String responseText = response.body().string();
                Log.d("gjg", responseText);
                final DailyContent dailyContent = Utility.handleDailyContentResponse(responseText);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (dailyContent != null) {
                            SharedPreferences.Editor editor = PreferenceManager.
                                    getDefaultSharedPreferences(DailyContentActivity.this).edit();
                            editor.putString("dailyContent", responseText);
                            editor.apply();
                            showDailyContent(dailyContent);

                        } else {
                            Log.d("gjg", "onResponse");
                            Toast.makeText(DailyContentActivity.this, "获取知乎信息失败", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }

}
