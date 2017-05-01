package com.example.zhihuimitate.db;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by pc on 2017/4/21.
 */

public class DailyData extends DataSupport {
    private int id;
    private String title;
    private String images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

}
