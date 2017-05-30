package com.codeclan.example.childactiontracker;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.gson.Gson;

import java.util.ArrayList;


public class MealActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    private Spinner mealSpinner;
    private Spinner mealResultSpinner;
    private EditText mealTimeEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal);



        ActivityList activityList = new ActivityList();
        ArrayList<String> mealTime = activityList.getMealList();
        ArrayList<String> mealTimeResult = activityList.getMealResultList();
        mealSpinner = (Spinner) findViewById(R.id.MealActivityResult_spinner);
        mealResultSpinner = (Spinner) findViewById(R.id.mealActivity_spinner);
        mealTimeEdit = (EditText) findViewById(R.id.meal_time_edit);

        displayMealListChoices(mealTime);
        displayMealResultListChoices(mealTimeResult);


//        SharedPreferences.Editor editor = this.prefs.edit();
//        editor.putString("mealDetails", this.gson.toJson(mealType));
//        editor.apply();
//        Toast.makeText(this,"Meal details added to Meal Time Page", Toast.LENGTH_LONG).show();

    }

    private void displayMealListChoices(ArrayList<String> mealList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealList);
        mealSpinner.setAdapter(adapter);

    }

    private void displayMealResultListChoices(ArrayList<String> mealResultList) {//        Spinner spinner = (Spinner) findViewById(R.id.MealActivityResult_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealResultList);
        mealResultSpinner.setAdapter(adapter);



    }

    public void onMealSaveButtonClick(View button) {
        String mealType = mealSpinner.getSelectedItem().toString();
        String mealResult = mealResultSpinner.getSelectedItem().toString();
        String mealTime = mealTimeEdit.getText().toString();

        System.out.println("spinner meal type is "+ mealType);
        System.out.println("spinner meal reasult is " + mealResult);
        System.out.println("time is " + mealTime);

        saveMealDetailsToSharedPreferences();
    }


    private String saveMealDetailsToSharedPreferences() {
        return "hello";


    }


}