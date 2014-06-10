package com.example.freshnesstracker.app;

import android.annotation.TargetApi;
import android.support.v4.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by dsangani on 5/31/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FruitWiki extends Fragment {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fruit_wiki,container,false);

    }
}
