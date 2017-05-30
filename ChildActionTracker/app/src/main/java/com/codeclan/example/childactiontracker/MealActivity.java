package com.codeclan.example.childactiontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MealActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);

        ActivityList activityList = new ActivityList();
        ArrayList<String> mealTime = activityList.getMealList();
        ArrayList<String> mealTimeResult = activityList.getMealResultList();

        displayMealListChoices(mealTime);
        displayMealResultListChoices(mealTimeResult);

    }
    private void displayMealListChoices(ArrayList<String> mealList) {
        Spinner spinner = (Spinner) findViewById(R.id.mealActivity_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,mealList);
        spinner.setAdapter(adapter);

    }
    private void displayMealResultListChoices(ArrayList<String> mealResultList) {
        Spinner spinner = (Spinner) findViewById(R.id.MealActivityResult_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,mealResultList);
        spinner.setAdapter(adapter);

    }

}

