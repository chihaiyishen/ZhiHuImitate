package com.example.zhihuimitate.db;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by pc on 2017/4/20.
 */

public class Daily extends DataSupport{
    /**
     * images : ["https://pic1.zhimg.com/v2-10d563cec9ad4566363661203b30cee4.jpg"]
     * type : 0
     * id : 9258656
     * ga_prefix : 042022
     * title : 小事 · 你让世界不一样
     */

    private int type;
    private int id;
    private String ga_prefix;
    private String title;
    private List<String> images;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    /*private int id;

    private String title;

    private String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }*/



}
