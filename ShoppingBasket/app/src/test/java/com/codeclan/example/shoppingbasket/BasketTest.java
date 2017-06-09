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
    private Basket basket;


    @Before
    public void before () {

        itemDetail1 = new ItemDetail("sausage",2,1);
        itemDetail2 = new ItemDetail("cornflakes",1,1);
        itemDetail3 = new ItemDetail("melon",2,1);
        basket = new Basket();
    }

    @Test
    public void checkBasketIsEmpty() {
        assertEquals(0,basket.getBasketSize());
    }

    @Test
    public void addOneItemToBasket() {
        basket.addItemToBasket(itemDetail1);
        assertEquals(1,basket.getBasketSize());
    }

    @Test
    public void addThreeItemsToBasket() {
        basket.addItemToBasket(itemDetail1);
        basket.addItemToBasket(itemDetail2);
        basket.addItemToBasket(itemDetail3);
        assertEquals(3, basket.getBasketSize());
    }

    @Test
    public void removeOneItemFromBasket() {
        basket.addItemToBasket(itemDetail1);
        basket.addItemToBasket(itemDetail2);
        basket.removeItemFromBasket(itemDetail1);
        assertEquals(2,basket.getBasketSize());
    }

}
