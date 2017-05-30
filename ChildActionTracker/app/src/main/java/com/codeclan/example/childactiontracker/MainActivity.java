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
    }


    public void onMealButtonClick(View button) {
        Intent intent = new Intent(this, MealActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }
    public void onNapButtonClick(View button) {
        Intent intent = new Intent(this, NapActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }

    public void onPottyButtonClick(View button) {
        Intent intent = new Intent(this, PottyActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }

    public void onMealListButtonClick(View button) {
        Intent intent = new Intent(this, MealListActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }
    public void onNapListButtonClick(View button) {
        Intent intent = new Intent(this, NapListActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }

    public void onPottyListButtonClick(View button) {
        Intent intent = new Intent(this, PottyListActivity.class);
//        intent.putExtra("pageChoice", results);
        startActivity(intent);
    }
}

