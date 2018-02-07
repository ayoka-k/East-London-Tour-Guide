package com.example.alena.eastlondonguide;

public class Attraction {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mDescription;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int imageResourceId, String description) {
        mImageResourceId = imageResourceId;
        mDescription = description;
    }

    public Attraction(String description) {
        mDescription = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getDescription() {
        return mDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
