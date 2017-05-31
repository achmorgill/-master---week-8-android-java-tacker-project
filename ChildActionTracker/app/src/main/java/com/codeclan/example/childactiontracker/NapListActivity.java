package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class NapListActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap_list);

        this.prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String napsJson = this.prefs.getString("naps", gson.toJson(new ArrayList<Action>().toString()));
        TypeToken<ArrayList<Action>> napArrayList = new TypeToken<ArrayList<Action>>(){};
        ArrayList<Action> javaNapArrayList = this.gson.fromJson(napsJson, napArrayList.getType());

        TextView list = (TextView) findViewById(R.id.nap_list_view);

        for (Action action: javaNapArrayList) {

            String napString = action.getTime() + " " + action.getActivity() + " " + action.getActivityResult();

            Log.d("here", action.getTime());
            System.out.println(napString);

            Intent intent = new Intent(this, NapListActivity.class);
            intent.putExtra("naps", napString);
            System.out.println("we are in a loop" + napString);
            list.setText(napString);
        }
    }
}
