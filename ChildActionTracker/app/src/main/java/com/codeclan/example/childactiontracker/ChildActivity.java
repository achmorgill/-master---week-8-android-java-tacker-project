package com.codeclan.example.childactiontracker;

import java.text.SimpleDateFormat;

import static android.R.attr.action;

/**
 * Created by user on 28/05/2017.
 */

public class ChildActivity extends Action {

    public ChildActivity(String currentDate, String currentTime, String activity, String activityResult) {

        super(currentDate,currentTime,activity,activityResult);
    }
}
