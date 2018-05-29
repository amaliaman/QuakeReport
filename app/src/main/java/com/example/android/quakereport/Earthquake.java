package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private double mMagnitude;
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Create a new {@link Earthquake} object
     *  @param location is where the earthquake happened
     * @param magnitude is the magnitude of the earthquake
     * @param timeInMilliseconds is when the earthquake happened
     * @param url is the url of the full details page in the USGS website
     */
    Earthquake(String location, double magnitude, long timeInMilliseconds, String url) {
        this.mLocation = location;
        this.mMagnitude = magnitude;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.mUrl = url;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }
}
