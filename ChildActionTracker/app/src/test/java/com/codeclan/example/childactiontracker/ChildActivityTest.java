package com.codeclan.example.childactiontracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class ChildActivityTest {


    ChildAction childActivity;


    @Before
    public void before() {
         childActivity = new ChildAction("12/05/17", "10:52","Breakfast","All");
    }


    @Test
        public void getActivityTest() {
        assertEquals("Breakfast", childActivity.getActivity());
    }

    @Test
    public void getActivityResultTest() {
        assertEquals("All", childActivity.getActivityResult());
    }

    @Test
    public void getCurrentDateTest() {
        assertEquals("12/05/17", childActivity.getDate());
    }
    @Test
    public void getCurrentTimeTest() {
        assertEquals("10:52", childActivity.getTime());

    }

}