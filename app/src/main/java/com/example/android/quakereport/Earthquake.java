package com.example.android.quakereport;

public class Earthquake {
    //The private variables
    private float mMg;
    private String mLocation;
    private String mDate;

    //the object
    public Earthquake(float mg,String location,String date){
        mMg=mg;
        mLocation=location;
        mDate=date;
    }

    public float getMg() {
        return mMg;
    }

    public String getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }
}
