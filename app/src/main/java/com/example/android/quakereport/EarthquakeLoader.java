package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by JulianParker on 12/28/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String mURL;
    private static final String LOG_TAG =EarthquakeLoader.class.getName();
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mURL=url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {

        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mURL == null) {
            return null;
        }

        List<Earthquake> result = QueryUtils.fetchEarthquakeData(mURL);
        return result;
    }
}
