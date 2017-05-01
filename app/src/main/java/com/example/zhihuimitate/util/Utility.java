package com.example.zhihuimitate.util;



import android.util.Log;

import com.example.zhihuimitate.db.Daily;
import com.example.zhihuimitate.db.DailyContent;
import com.example.zhihuimitate.db.DailyData;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by pc on 2017/4/6.
 */

public class Utility {

    public static boolean handleZhiHuDailyResponse(String response, List<DailyData> dailyDataList) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("stories");
            for (int i = 0; i < jsonArray.length();i++) {
                Gson gson = new Gson();
                Daily daily = gson.fromJson(jsonArray.getString(i), Daily.class);
                DailyData dailyData = new DailyData();
                dailyData.setId(daily.getId());
                dailyData.setTitle(daily.getTitle());
                dailyData.setImages(daily.getImages().get(0));
                dailyDataList.add(dailyData);
                Log.d("gjg", dailyData.getTitle());
                Log.d("gjg", String.valueOf(dailyData.getId()));
                Log.d("gjg", dailyData.getImages());
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean refreshZhiHuDailyResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("stories");
            for (int i = 0; i < jsonArray.length();i++) {
                Gson gson = new Gson();
                Daily daily = gson.fromJson(jsonArray.getString(i), Daily.class);
                DailyData dailyData = new DailyData();
                dailyData.setId(daily.getId());
                dailyData.setTitle(daily.getTitle());
                dailyData.setImages(daily.getImages().get(0));
                Log.d("gjg", dailyData.getTitle());
                Log.d("gjg", String.valueOf(dailyData.getId()));
                Log.d("gjg", dailyData.getImages());
                dailyData.updateAll();
            }
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static DailyContent handleDailyContentResponse(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            return new Gson().fromJson(jsonObject.toString(), DailyContent.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
