package com.example.freshnesstracker.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.ListFragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dsangani on 5/31/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class ViewFruits extends ListFragment {

    private ArrayAdapter<String> adapter;

    String FILENAME = "my_fruits";

    private String[] list = {"Banana", "Apple", "Oranges",
            "Watermelon"};

    ListView listView;


    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout theLayout = (LinearLayout) inflater.inflate(R.layout.view_fruits, container, false);
//        listView = (ListView)theLayout.findViewById();
        return theLayout;

//        return inflater.inflate(R.layout.view_fruits, container, false);
//        return

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FileOutputStream fos = null;
        try {
            fos = getActivity().getApplicationContext().openFileOutput(FILENAME, Context.MODE_PRIVATE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write(list.toString().getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.view_fruits_title, R.id.textView1, list);

        setListAdapter(adapter);
        getListView().setTextFilterEnabled(true);
    }

}
