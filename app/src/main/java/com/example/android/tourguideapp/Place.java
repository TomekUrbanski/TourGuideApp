package com.example.android.tourguideapp;

public class Place {

    private String mPlaceName;
    private String mPlaceAdres;
    private int mImageResourceId;

    public Place(String aName, String aAdres, int imageResourceId) {
        mPlaceName = aName;
        mPlaceAdres = aAdres;
        mImageResourceId = imageResourceId;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public String getmPlaceAdres() {
        return mPlaceAdres;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}

