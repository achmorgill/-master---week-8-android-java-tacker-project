package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/06/2017.
 */

public class ItemDetailTest {
    private ItemDetail itemDetail;

    @Before
    public void before() {
        itemDetail = new ItemDetail("sausages", 2, 1);
    }

    @Test
    public void itemDetailNotNullTest() {
    }

    @Test
    public void nameTest() {
        assertEquals("sausages", itemDetail.getName());
    }

    @Test
    public void costTest() {
        assertEquals(2,itemDetail.getCost());
    }

    @Test
    public void numberTest() {
        assertEquals(1, itemDetail.getNumber());
    }

}
