package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class PottyListActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potty_list);


    }
}




//this section needs to be moved to pottyListActivity

    //        String getSharedPrefsKey = getString(R.string.pref_key);
//        this.prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
//    String getPottysJson = this.prefs.getString("pottys", new ArrayList<Action>().toString());
//        Log.d("POTTY ", getPottysJson);


