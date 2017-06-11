package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on 09/06/2017.
 */

public class ItemDetailTest {
    private ItemDetail itemDetail;

    @Before
    public void before() {
        itemDetail = new ItemDetail("sausages", 200, 1, "BOGOF");
    }

    @Test
    public void itemDetailNotNullTest() {
        assertNotNull(itemDetail);
    }

    @Test
    public void nameTest() {
        assertEquals("sausages", itemDetail.getName());
    }

    @Test
    public void costTest() {
        assertEquals(200,itemDetail.getCost());
    }

    @Test
    public void numberTest() {
        assertEquals(1, itemDetail.getNumber());
    }

    @Test
    public void discountCodeTest() {
        assertEquals("BOGOF", itemDetail.getDiscountCode());
    }

}
