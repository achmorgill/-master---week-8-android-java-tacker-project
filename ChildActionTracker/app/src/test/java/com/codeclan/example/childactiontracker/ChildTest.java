package com.codeclan.example.childactiontracker;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 28/05/2017.
 */
public class ChildTest {
    Child child;

    @Test
    public void getNameTest() {
        child = new Child("Charlie Wallace", 3);

       assertEquals("Charlie Wallace",child.getName());
    }

    @Test
    public void getAgeTest() {
        child = new Child("Charlie Wallace", 3);

        assertEquals(3,child.getAge());
    }

}

