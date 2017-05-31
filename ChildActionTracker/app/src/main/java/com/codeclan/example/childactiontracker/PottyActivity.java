package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

public class PottyActivity extends AppCompatActivity {
    private SharedPreferences prefs;
    private Gson gson = new Gson();

    private TextView titleText;
    private Spinner pottySpinner;
    private Spinner pottyResultSpinner;
    private EditText pottyTimeEdit;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap);

        ActivityList activityList = new ActivityList();
        ArrayList<String> pottyTime = activityList.getPottyList();
        ArrayList<String> pottyTimeResult = activityList.getPottyResultList();

        titleText = (TextView) findViewById(R.id.title_text_view);
        pottySpinner = (Spinner) findViewById(R.id.Activity_spinner);
        pottyResultSpinner = (Spinner) findViewById(R.id.ActivityResult_spinner);
        pottyTimeEdit = (EditText) findViewById(R.id.time_edit);
        image = (ImageView) findViewById(R.id.image_view);
        titleText.setText("Potty Times");
        image.setImageResource(R.drawable.pottypic);

        displayPottyListChoices(pottyTime);
        displayPottyResultListChoices(pottyTimeResult);
    }

    private void displayPottyListChoices(ArrayList<String> pottyList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, pottyList);
        pottySpinner.setAdapter(adapter);

    }

    private void displayPottyResultListChoices(ArrayList<String> pottyResultList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, pottyResultList);
        pottyResultSpinner.setAdapter(adapter);

    }

    public void onSaveButtonClick(View button) {
        String pottyType = pottySpinner.getSelectedItem().toString();
        String pottyResult = pottyResultSpinner.getSelectedItem().toString();
        String pottyTime = pottyTimeEdit.getText().toString();
        String category = "potty";
        Action pottyActivityToBeSaved = new Action(pottyTime, pottyType, pottyResult, category);

        String sharedPrefsKey = getString(R.string.pref_key);
        this.prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
        String pottysJson = this.prefs.getString("pottys", new ArrayList<Action>().toString());
        Log.d("pottys", pottysJson);

        TypeToken<ArrayList<Action>> pottyArrayList = new TypeToken<ArrayList<Action>>() {
        };
        ArrayList<Action> javaPottyArrayList = this.gson.fromJson(pottysJson, pottyArrayList.getType());
        javaPottyArrayList.add(pottyActivityToBeSaved);

        SharedPreferences.Editor editor = this.prefs.edit();
        editor.putString("pottys", this.gson.toJson(javaPottyArrayList));
        editor.apply();
        Toast.makeText(this, "potty details added", Toast.LENGTH_LONG).show();

    }


}

