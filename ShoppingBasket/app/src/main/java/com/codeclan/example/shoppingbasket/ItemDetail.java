package com.codeclan.example.shoppingbasket;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class ItemDetail {


    private String name;
    private int cost;
    private int number;
    private String discountCode;

    public ItemDetail(String name, int cost, int number, String discountCode) {
        this.name = name;
        this.cost = cost;
        this.number = number;
        this.discountCode = discountCode;

    }

    public String getName() {
        return this.name;
    }

    public int getCost() {
        return this.cost;
    }

    public int getNumber() {
        return this.number;
    }

    public String getDiscountCode() {
        return this.discountCode;
    }
}

