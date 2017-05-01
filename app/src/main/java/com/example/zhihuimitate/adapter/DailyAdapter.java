package com.example.zhihuimitate.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zhihuimitate.R;
import com.example.zhihuimitate.db.Daily;
import com.example.zhihuimitate.db.DailyData;
import com.example.zhihuimitate.ui.DailyContentActivity;

import java.util.List;

/**
 * Created by pc on 2017/4/6.
 */

public class DailyAdapter extends RecyclerView.Adapter<DailyAdapter.ViewHolder>{

    private Context mContext;

    private List<DailyData> mDailyList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        ImageView dailyImage;
        TextView dailyTitle;

        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            dailyImage = (ImageView) view.findViewById(R.id.daily_images);
            dailyTitle = (TextView) view.findViewById(R.id.daily_title);
        }
    }

    public DailyAdapter(List<DailyData> daliyList) {
        mDailyList = daliyList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (mContext == null) {
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.daily_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                DailyData dailyData = mDailyList.get(position);
                Intent intent = new Intent(mContext, DailyContentActivity.class);
                intent.putExtra("id", dailyData.getId());
                Log.d("gjg", "DailyAdapter : " + dailyData.getId());
                Log.d("gjg", "DailyAdapter : " + dailyData.getTitle());
                Log.d("gjg", "DailyAdapter : " + dailyData.getImages());
                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        DailyData daily = mDailyList.get(position);
        holder.dailyTitle.setText(daily.getTitle());
        Glide.with(mContext).load(daily.getImages()).centerCrop()
                .error(R.drawable.background_android).into(holder.dailyImage);

    }

    @Override
    public int getItemCount() {
        return mDailyList.size();
    }
}
