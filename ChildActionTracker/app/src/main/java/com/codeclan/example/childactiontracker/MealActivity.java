package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;


public class MealActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    private Spinner mealSpinner;
    private Spinner mealResultSpinner;
    private EditText mealTimeEdit;
    private ImageView image;
    private TextView titleText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap);

        ActivityList activityList = new ActivityList();
        ArrayList<String> mealTime = activityList.getMealList();
        ArrayList<String> mealTimeResult = activityList.getMealResultList();

        titleText = (TextView) findViewById(R.id.title_text_view);
        mealSpinner = (Spinner) findViewById(R.id.Activity_spinner);
        mealResultSpinner = (Spinner) findViewById(R.id.ActivityResult_spinner);
        mealTimeEdit = (EditText) findViewById(R.id.time_edit);
        image = (ImageView) findViewById(R.id.image_view);
        titleText.setText("Meal Times");
        image.setImageResource(R.drawable.vegetables);

        displayMealListChoices(mealTime);
        displayMealResultListChoices(mealTimeResult);


    }

    private void displayMealListChoices(ArrayList<String> mealList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealList);
        mealSpinner.setAdapter(adapter);

    }

    private void displayMealResultListChoices(ArrayList<String> mealResultList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mealResultList);
        mealResultSpinner.setAdapter(adapter);

    }

    public void onSaveButtonClick(View button) {
        String mealType = mealSpinner.getSelectedItem().toString();
        String mealResult = mealResultSpinner.getSelectedItem().toString();
        String mealTime = mealTimeEdit.getText().toString();
        String category = "meal";
        Action mealActivityToBeSaved = new Action(mealTime, mealType, mealResult, category);

        String sharedPrefsKey = getString(R.string.pref_key);
        this.prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
        String mealsJson = this.prefs.getString("meals", new ArrayList<Action>().toString());
        Log.d("meals", mealsJson);

        TypeToken<ArrayList<Action>> mealArrayList = new TypeToken<ArrayList<Action>>(){};
        ArrayList<Action> javaMealArrayList = this.gson.fromJson(mealsJson, mealArrayList.getType());
        javaMealArrayList.add(mealActivityToBeSaved);

        SharedPreferences.Editor editor = this.prefs.edit();
        editor.putString("meals", this.gson.toJson(javaMealArrayList));
        editor.apply();
        Toast.makeText(this, "Meal details added", Toast.LENGTH_LONG).show();
    }


}

