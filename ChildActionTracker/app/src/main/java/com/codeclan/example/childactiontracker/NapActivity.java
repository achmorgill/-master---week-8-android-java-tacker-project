package com.codeclan.example.childactiontracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class NapActivity extends AppCompatActivity {

    private SharedPreferences prefs;
    private Gson gson = new Gson();

    private Spinner napSpinner;
    private Spinner napResultSpinner;
    private EditText napTimeEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nap);


        ActivityList activityList = new ActivityList();
        ArrayList<String> napTime = activityList.getNapList();
        ArrayList<String> napTimeResult = activityList.getNapResultList();
        napSpinner = (Spinner) findViewById(R.id.Activity_spinner);
        napResultSpinner = (Spinner) findViewById(R.id.ActivityResult_spinner);
        napTimeEdit = (EditText) findViewById(R.id.time_edit);

        displayNapListChoices(napTime);
        displayNapResultListChoices(napTimeResult);
    }
    private void displayNapListChoices(ArrayList<String> napList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, napList);
        napSpinner.setAdapter(adapter);

    }

    private void displayNapResultListChoices(ArrayList<String> napResultList) {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, napResultList);
        napResultSpinner.setAdapter(adapter);

    }

    public void onSaveButtonClick(View button) {
        String napType = napSpinner.getSelectedItem().toString();
        String napResult = napResultSpinner.getSelectedItem().toString();
        String napTime = napTimeEdit.getText().toString();
        String category = "nap";
        Action napActivityToBeSaved = new Action(napTime, napType, napResult, category);

        String sharedPrefsKey = getString(R.string.pref_key);
        this.prefs = getSharedPreferences(sharedPrefsKey, Context.MODE_PRIVATE);
        String napsJson = this.prefs.getString("naps", new ArrayList<Action>().toString());
        Log.d("naps", napsJson);

        TypeToken<ArrayList<Action>> napArrayList = new TypeToken<ArrayList<Action>>(){};
        ArrayList<Action> javaNapArrayList = this.gson.fromJson(napsJson, napArrayList.getType());
        javaNapArrayList.add(napActivityToBeSaved);

        SharedPreferences.Editor editor = this.prefs.edit();
        editor.putString("naps", this.gson.toJson(javaNapArrayList));
        editor.apply();
        Toast.makeText(this, "Nap details added", Toast.LENGTH_LONG).show();
    }


}
