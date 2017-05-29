package com.codeclan.example.childactiontracker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 28/05/2017.
 */

public class Action {

    SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat("dd/MM/yy");
    String currentDate = simpleDateFormatDate.format(new Date());
    SimpleDateFormat simpleDateFormatTime = new SimpleDateFormat("hh:mm");
    String currentTime = simpleDateFormatTime.format(new Date());

    private String activity;
    private String activityResult;


    public Action (String currentDate, String currentTime, String activity, String activityResult) {
        this.currentTime = currentTime;
        this.currentDate = currentDate;
        this.activity = activity;
        this.activityResult = activityResult;
    }


    public String getDate() {
        return this.currentDate;
    }

    public String getTime() {
        return this.currentTime;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getActivityResult() {
        return this.activityResult;
    }
}
