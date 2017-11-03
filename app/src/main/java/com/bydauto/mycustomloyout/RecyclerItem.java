package com.bydauto.mycustomloyout;

/**
 * Created by byd_tw on 2017/7/12.
 */

public class RecyclerItem {
    private int imageId;
    private String title;

    public RecyclerItem(int imageId, String title) {
        this.imageId = imageId;
        this.title = title;
    }

    public int getImageId() {

        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
