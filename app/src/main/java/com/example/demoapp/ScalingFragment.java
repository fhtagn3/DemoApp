package com.example.demoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Eugene on 01.09.2015.
 */
public class ScalingFragment extends Fragment {

    private static final String LOG_TAG = "ScalingFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.scaling_fragment, container, false);
        Log.d(LOG_TAG, "d");
        return v;
    }
}
