package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class ItemDetail {


    private String name;
    private int cost;
    private int number;

    public ItemDetail(String name, int cost, int number) {
        this.name = name;
        this.cost = cost;
        this.number = number;

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
}

