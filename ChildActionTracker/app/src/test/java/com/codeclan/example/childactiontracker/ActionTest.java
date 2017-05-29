package com.codeclan.example.childactiontracker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class ActionTest {
    Action action;

    @Test
    public void getDateTest() {
        action = new Action ("28/05/17", "10:52","tinkle","potty");
        assertEquals("28/05/17", action.getDate());

    }

    @Test
    public void getTimeTest() {
        action = new Action ("28/05/17", "10:52","tinkle","potty");
        assertEquals("10:52", action.getTime());
    }

    @Test
    public void getActivityTest() {
        action = new Action ("28/05/17", "10:52","tinkle","potty");
        assertEquals("tinkle",action.getActivity());
    }

    @Test
    public void getActivityResultTest() {
        action = new Action ("28/05/17", "10:52","tinkle","potty");
        assertEquals("potty",action.getActivityResult());
    }

}