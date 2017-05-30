package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class MealActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);



        ActivityList activityList = new ActivityList();
        ArrayList<String> mealTime = activityList.getMealList();
        ArrayList<String> mealTimeResult = activityList.getMealResultList();

        displayMealListChoices(mealTime);
        displayMealResultListChoices(mealTimeResult);

//        SharedPreferences.Editor editor = this.prefs.edit();
//        editor.putString("mealDetails", this.gson.toJson(mealType));
//        editor.apply();
//        Toast.makeText(this,"Meal details added to Meal Time Page", Toast.LENGTH_LONG).show();

    }

    private void displayMealListChoices(ArrayList<String> mealList) {
        Spinner spinner = (Spinner) findViewById(R.id.mealActivity_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealList);
        spinner.setAdapter(adapter);

    }

    private void displayMealResultListChoices(ArrayList<String> mealResultList) {
        Spinner spinner = (Spinner) findViewById(R.id.MealActivityResult_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealResultList);
        spinner.setAdapter(adapter);
        System.out.println("adapter is here " + adapter);


    }

    public void onMealSaveButtonClick(View button) {


        getMealDetailsFromSharedPreferences();
    }

    public void saveNewMealDetails() {
//        get all information from each field
//                user info to build a meal action object
//                use persistent data - save into share deleteSharedPreferences()
    }

    private String getMealDetailsFromSharedPreferences() {
//        String sharedPrefsKey = getString(R.string.pref_key);
//        this.prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
//        String mealsJson = this.prefs.getString("mealType",?????????)
        return "hello there";

    }


}