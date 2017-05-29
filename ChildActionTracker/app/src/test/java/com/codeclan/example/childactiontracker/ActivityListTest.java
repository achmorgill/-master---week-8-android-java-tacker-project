package com.codeclan.example.childactiontracker;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 29/05/2017.
 */
public class ActivityListTest {

    @Test
    public void getMeallistTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getMealList());
    }
    @Test
    public void getMealResultListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getMealResultList());
    }
    @Test
    public void getNapListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getNapList());
    }
    @Test
    public void getNapResultListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getNapResultList());
    }
    @Test
    public void getPottyListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getPottyList());
    }
    @Test
    public void getPottyResultListTest() {
        ActivityList activityList = new ActivityList();
        assertNotNull(activityList.getPottyResultList());
    }

}