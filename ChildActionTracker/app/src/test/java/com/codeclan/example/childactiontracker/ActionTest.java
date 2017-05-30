package com.codeclan.example.childactiontracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class ActionTest {
    private Action action;

    @Before
    public void before() {
        action = new ChildAction("10:52", "tinkle", "potty");
    }


    @Test
    public void getTimeTest() {
        assertEquals("10:52", action.getTime());
    }

    @Test
    public void getActivityTest() {
        assertEquals("tinkle",action.getActivity());
    }

    @Test
    public void getActivityResultTest() {
        assertEquals("potty",action.getActivityResult());
    }

}