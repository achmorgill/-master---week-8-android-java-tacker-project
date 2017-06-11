package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 11/06/2017.
 */

public class CustomerTest {
    private Customer customer1;
    private Customer customer2;

    @Before
    public void Before() {
        customer1 = new Customer("Susan Smith", "1033");
        customer2 = new Customer("David Brown", "");
    }

    @Test
    public void getCustomerNameTest() {
        assertEquals("Susan Smith", customer1.getName());
    }

    @Test
    public void getLoyaltyCardNumber() {
        assertEquals("1033",customer1.getloyaltyCardNumber());
    }

    @Test
    public void customerHasLoyaltyCardTest() {
        assertEquals(true, customer1.getCustomerLoyaltyCardDetails());
    }

    @Test
    public void customerHasNoLoyaltyCardTest() {
        assertEquals(false, customer2.getCustomerLoyaltyCardDetails());

    }
}
