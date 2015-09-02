package com.example.demoapp;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

/**
 * Created by Eugene on 01.09.2015.
 */
public class MainActivity extends AppCompatActivity {

    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        tabHost = (FragmentTabHost) findViewById(R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        tabHost.addTab(createTabSpec("list", R.string.tab_title_list), ListFragment.class, null);
        tabHost.addTab(createTabSpec("scaling", R.string.tab_title_scaling), ScalingFragment.class, null);
        tabHost.addTab(createTabSpec("service", R.string.tab_title_service), ServiceFragment.class, null);
        tabHost.addTab(createTabSpec("map", R.string.tab_title_map), MapFragment.class, null);
        tabHost.setCurrentTab(0);
    }

    private TabHost.TabSpec createTabSpec(String tag, int stringRes){
        FragmentTabHost.TabSpec spec = tabHost.newTabSpec(tag);
        spec.setIndicator(getString(stringRes));
        return spec;
    }
}
