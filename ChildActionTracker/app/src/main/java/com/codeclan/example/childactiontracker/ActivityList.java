package com.codeclan.example.childactiontracker;

import java.util.ArrayList;

/**
 * Created by user on 29/05/2017.
 */

public class ActivityList {

    private ArrayList<String> mealList;
    private ArrayList<String> mealResultList;
    private ArrayList<String> napList;
    private ArrayList<String> napResultList;
    private ArrayList<String> pottyList;
    private ArrayList<String> pottyResultList;

    public ActivityList() {
        
        mealList = new ArrayList<String>();
        mealList.add("Breakfast");
        mealList.add("Lunch");
        mealList.add("Dinner");
        mealList.add("Snack");


        mealResultList = new ArrayList<String>();
        mealResultList.add("All Eaten");
        mealResultList.add("Some Eaten");
        mealResultList.add("Not Eaten");

        napList = new ArrayList<String>();
        napList.add("Nap in car");
        napList.add("Nap in nursery");

        napResultList = new ArrayList<String>();
        napResultList.add("Under 15 mins");
        napResultList.add("15-30 mins");
        napResultList.add("30-60 mins");
        napResultList.add("1-2 hours");

        pottyList = new ArrayList<String>();
        pottyList.add("Tinkle");
        pottyList.add("Smelly");

        pottyResultList = new ArrayList<String>();
        pottyResultList.add("Toilet");
        pottyResultList.add("Potty");
        pottyResultList.add("Pants");
    }


    public ArrayList<String> getMealList() {
        return mealList;
    }

    public ArrayList<String> getMealResultList() {
        return mealResultList;
    }

    public ArrayList<String> getNapList() {
        return napList;
    }

    public ArrayList<String> getNapResultList() {
        return napResultList;
    }

    public ArrayList<String> getPottyList() {
        return pottyList;
    }

    public ArrayList<String> getPottyResultList() {
        return pottyResultList;
    }

}
