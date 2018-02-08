package com.example.alena.eastlondonguide;

import android.content.Intent;

public class Attraction {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAttractionNameResourceId;
    private int mDescriptionResourceId;
    private String mLocation;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int imageResourceId, int attractionName, int description, String location) {
        mImageResourceId = imageResourceId;
        mAttractionNameResourceId = attractionName;
        mDescriptionResourceId = description;
        mLocation = location;
    }

    public Attraction(int attractionName, int description, String location) {
        mAttractionNameResourceId = attractionName;
        mDescriptionResourceId = description;
        mLocation = location;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAttractionName() { return mAttractionNameResourceId; }

    public int getDescription() {
        return mDescriptionResourceId;
    }

    public String getLocation() { return mLocation; }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
