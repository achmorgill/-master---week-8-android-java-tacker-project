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
//    private PageChoice choice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mealButton = (Button) findViewById(R.id.meal_button);
        napButton = (Button) findViewById(R.id.nap_button);
        pottyButton = (Button) findViewById(R.id.potty_button);


    public void onMealButtonClick(View button) {
        Intent intent = new Intent(this, MealActivity.class);
        intent.putExtra("pageChoice",PageChoice.MEALS);
        startActivity(intent)
    }



}
}
