package com.mtlckr.manifestcar.Adapter;

import java.io.Serializable;

public class MainItem implements Serializable {

    String textMain;
    int imageMain;

    public MainItem (String text, int image) {
        this.textMain = text;
        this.imageMain = image;
    }

    public String getText() {
        return textMain;
    }

    public void setText(String text) {
        this.textMain = text;
    }

    public int getImage() {
        return imageMain;
    }

    public void setImage(int image) {
        this.imageMain = image;
    }
}
