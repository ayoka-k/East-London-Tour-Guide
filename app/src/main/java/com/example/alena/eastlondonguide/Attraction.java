package com.example.alena.eastlondonguide;

public class Attraction {

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private String mAttractionName;
    private String mDescription;
    public static final int NO_IMAGE_PROVIDED = -1;

    public Attraction(int imageResourceId, String attractionName, String description) {
        mImageResourceId = imageResourceId;
        mAttractionName = attractionName;
        mDescription = description;
    }

    public Attraction(String attractionName, String description) {
        mAttractionName = attractionName;
        mDescription = description;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getAttractionName() { return mAttractionName; }

    public String getDescription() {
        return mDescription;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
