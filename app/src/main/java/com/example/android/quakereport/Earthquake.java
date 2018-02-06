package com.example.android.quakereport;

/**
 * Created by JulianParker on 12/18/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliSeconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeinmilliseconds, String url ){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliSeconds= timeinmilliseconds;
        mUrl = url;

    }

    public double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public long getTimeInMilliseconds(){return mTimeInMilliSeconds;}
    public String getUrl(){return mUrl;}

}
