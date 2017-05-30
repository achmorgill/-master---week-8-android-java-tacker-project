package com.codeclan.example.childactiontracker;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 28/05/2017.
 */

public class Action implements Serializable {


    private String activity;
    private String activityResult;
    private String time;
    private String category;



    public Action (String time, String activity, String activityResult, String category) {
        this.time = time;
        this.activity = activity;
        this.activityResult = activityResult;
        this.category = category;
    }


    public String getTime() {
        return this.time;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getActivityResult() {
        return this.activityResult;
    }

    public String getCategory() { return this.category;}
}
