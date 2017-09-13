package com.example.android.quakereport;

/**
 * Created by edgarcgarzon on 9/13/17.
 */

public class Earthquake {

    /** Magnitude of the earthquake*/
    private String mMagnitude;

    /** Location of the earthquake*/
    private String mLocation;

    /** Date of the earthquake */
    private String mDate;

    /**
     *
     * @param magnitude
     * @param location
     * @param date
     */
    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     *
     * @return
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     *
     * @return
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     *
     * @return
     */
    public String getDate() {
        return mDate;
    }
}

