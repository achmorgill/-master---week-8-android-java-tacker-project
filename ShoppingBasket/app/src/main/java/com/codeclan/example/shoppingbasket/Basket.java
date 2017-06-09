package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class Basket {
    ArrayList<ItemDetail> itemList = new ArrayList<>();


    public int getBasketSize() {
        return itemList.size();
    }

    public void addItemToBasket(ItemDetail itemDetail) {
        itemList.add(itemDetail);
    }

    public void removeItemFromBasket(ItemDetail itemDetail) {
        System.out.println("hello");
        System.out.println(itemList);

        for (ItemDetail itemDetail: itemList) {
            System.out.println(itemList)

        }
//        itemList.remove(itemList(0));
    }
}
