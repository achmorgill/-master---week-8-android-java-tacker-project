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

public class PottyListActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potty_list);

        this.prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);
        String pottysJson = this.prefs.getString("pottys", gson.toJson(new ArrayList<Action>().toString()));
        TypeToken<ArrayList<Action>> pottyArrayList = new TypeToken<ArrayList<Action>>(){};
        ArrayList<Action> javaPottyArrayList = this.gson.fromJson(pottysJson, pottyArrayList.getType());

        TextView list = (TextView) findViewById(R.id.potty_list_view);

        for (Action action: javaPottyArrayList) {

            String pottyString = action.getTime() + " " + action.getActivity() + " " + action.getActivityResult();
            Intent intent = new Intent(this, PottyListActivity.class);
            intent.putExtra("pottys", pottyString);
            System.out.println("we are in a loop" + pottyString);
            list.setText(pottyString);
        }
    }
}


