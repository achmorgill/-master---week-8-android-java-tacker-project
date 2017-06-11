package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 09/06/2017.
 */

public class BasketTest {

    private ItemDetail itemDetail1;
    private ItemDetail itemDetail2;
    private ItemDetail itemDetail3;
    private ItemDetail itemDetail4;
    private ItemDetail itemDetail5;
    private Basket basket;
    private Customer customer;


    @Before
    public void before () {

        itemDetail1 = new ItemDetail("sausage",200,2,"BOGOF");
        itemDetail2 = new ItemDetail("cornflakes",400,1,"");
        itemDetail3 = new ItemDetail("melon",300,1,"");
        itemDetail4 = new ItemDetail("wine",600,2,"");
        itemDetail5 = new ItemDetail("milk",100,3,"BOGOF");

        basket = new Basket();
    }

    @Test
    public void checkBasketIsEmptyTest() {
        assertEquals(0,basket.getBasketSize());
    }

    @Test
    public void addOneItemToBasketTest() {
        basket.addItemToBasket(itemDetail1);
        assertEquals(1,basket.getBasketSize());
    }

    @Test
    public void addFourItemsToBasketTest() {
        basket.addItemToBasket(itemDetail1);
        basket.addItemToBasket(itemDetail2);
        basket.addItemToBasket(itemDetail3);
        basket.addItemToBasket(itemDetail4);
        assertEquals(4, basket.getBasketSize());
    }

    @Test
    public void removeOneItemFromBasketTest() {
        basket.addItemToBasket(itemDetail1);
        basket.addItemToBasket(itemDetail2);
        basket.removeItemFromBasket(itemDetail1);
        assertEquals(1,basket.getBasketSize());
    }

    @Test
    public void emptyTheBasketTest() {
        addFourItemsToBasketTest();
        basket.emptyBasket();
        assertEquals(0, basket.getBasketSize());
    }

    @Test
    public void calculateValueOfBasketWithBOGOFTest() {
        basket.addItemToBasket(itemDetail5);
        assertEquals(200, basket.getValueOfBasket());
    }

    @Test
    public void calculateValueOfBasketTest() {
        addFourItemsToBasketTest();
        assertEquals(2100, basket.getValueOfBasket());
    }

    @Test
    public void calculateValueOfBasketWithMultiplesTest() {
        addFourItemsToBasketTest();
        assertEquals(2100, basket.getValueOfBasket());
    }

    @Test
    public void ifTotalIsOver20PoundAdd20PercentDiscountTest() {
        addFourItemsToBasketTest();
        int basketTotal = basket.getValueOfBasket();

        assertEquals(1900, basket.get10PercentDiscountWhenTotalOver20(basketTotal));

    }

    @Test
    public void addLoyaltyCardDiscountTest() {
        addFourItemsToBasketTest();
        int basketTotal = basket.getValueOfBasket();
        int newBasketTotal = basket.get10PercentDiscountWhenTotalOver20(basketTotal);
        assertEquals(1862, basket.get2PercentDiscountForLoyaltyCardsFinalTotal(newBasketTotal));
    }

    @Test
    public void calculateFinalCostOfBasketWithLoyaltyCardTest() {
        addFourItemsToBasketTest();
        customer = new Customer("May Manson", "1234");
        boolean customerHasLoyaltyCard = customer.getCustomerLoyaltyCardDetails();
        assertEquals(1862, basket.getCostOfBasketFinal(customerHasLoyaltyCard));
    }

    @Test
    public void calculateFinalCostOfBasketWithoutLoyaltyCardTest() {
        addFourItemsToBasketTest();
        customer = new Customer("Mike Morrison", "");
        boolean customerHasNoLoyaltyCard = customer.getCustomerLoyaltyCardDetails();

        assertEquals(1900, basket.getCostOfBasketFinal(customerHasNoLoyaltyCard));

    }


}
