package com.codeclan.example.childactiontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mealButton;
    private Button napButton;
    private Button pottyButton;
    private Button mealListButton;
    private Button napListButton;
    private Button pottyListButton;
    private Button childNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mealButton = (Button) findViewById(R.id.meal_button);
        napButton = (Button) findViewById(R.id.nap_button);
        pottyButton = (Button) findViewById(R.id.potty_button);
        mealListButton = (Button) findViewById(R.id.meal_list_button);
        napListButton = (Button) findViewById(R.id.nap_list_button);
        pottyListButton = (Button) findViewById(R.id.potty_list_button);
        childNameButton = (Button) findViewById(R.id.child_name_button);
    }

    public void onChildNameButtonClick(View button) {
        Intent intent = new Intent(this, ChildNameActivity.class);
    }

    public void onMealButtonClick(View button) {
        Intent intent = new Intent(this, MealActivity.class);
        startActivity(intent);
    }
    public void onNapButtonClick(View button) {
        Intent intent = new Intent(this, NapActivity.class);
        startActivity(intent);
    }

    public void onPottyButtonClick(View button) {
        Intent intent = new Intent(this, PottyActivity.class);
        startActivity(intent);
    }

    public void onMealListButtonClick(View button) {
        Intent intent = new Intent(this, MealListActivity.class);
        startActivity(intent);
    }
    public void onNapListButtonClick(View button) {
        Intent intent = new Intent(this, NapListActivity.class);
        startActivity(intent);
    }

    public void onPottyListButtonClick(View button) {
        Intent intent = new Intent(this, PottyListActivity.class);
        startActivity(intent);
    }
}

