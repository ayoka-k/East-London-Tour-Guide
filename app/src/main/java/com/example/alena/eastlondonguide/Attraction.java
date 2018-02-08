package com.example.alena.eastlondonguide;

public class Attraction {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAttractionNameResourceId;
    private int mDescriptionResourceId;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int imageResourceId, int attractionName, int description) {
        mImageResourceId = imageResourceId;
        mAttractionNameResourceId = attractionName;
        mDescriptionResourceId = description;
    }

    public Attraction(int attractionName, int description) {
        mAttractionNameResourceId = attractionName;
        mDescriptionResourceId = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAttractionName() { return mAttractionNameResourceId; }

    public int getDescription() {
        return mDescriptionResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
