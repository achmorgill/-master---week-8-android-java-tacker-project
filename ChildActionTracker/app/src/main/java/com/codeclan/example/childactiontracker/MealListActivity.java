package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class MealListActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_list);

        this.prefs = getSharedPreferences(getString(R.string.pref_key), Context.MODE_PRIVATE);

        String mealsJson = this.prefs.getString("meals", gson.toJson(new ArrayList<Action>().toString()));
        TypeToken<ArrayList<Action>> mealArrayList = new TypeToken<ArrayList<Action>>(){};
        ArrayList<Action> javamealArrayList = this.gson.fromJson(mealsJson, mealArrayList.getType());

        TextView list = (TextView) findViewById(R.id.meal_list_view);

        for (Action action: javamealArrayList) {

            String mealString = action.getTime() + " " + action.getActivity() + " " + action.getActivityResult();
            Intent intent = new Intent(this, MealListActivity.class);
            intent.putExtra("meals", mealString);
            System.out.println("we are in a loop" + mealString);
            list.setText(mealString);
        }
    }
}

