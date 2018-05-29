package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String QUAKES_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?" +
            "format=geojson&eventtype=earthquake&orderby=time&minmag=6&limit=10";

    EarthquakeLoader(Context context) {
        super(context);
    }

    @Override
    public List<Earthquake> loadInBackground() {
        return QueryUtils.fetchEarthquakeData(QUAKES_URL);
    }
}
