package com.codeclan.example.shoppingbasket;

import android.content.ClipData;

import java.util.ArrayList;

/**
 * Created by user on 09/06/2017.
 */

class Basket {
    ArrayList<ItemDetail> itemList = new ArrayList<>();
    private int a2PercentDiscountForLoyaltyCardsFinalTotal;


    public int getBasketSize() {
        return itemList.size();
    }

    public void addItemToBasket(ItemDetail itemDetail) {
        itemList.add(itemDetail);
    }

    public void removeItemFromBasket(ItemDetail itemDetail) {

        for (ItemDetail value : itemList) {
            if (value == itemDetail) {;
                itemList.remove(value);
            }
        }

    }

    public void emptyBasket() {
        itemList.clear();
    }

    public int getValueOfBasket() {
        int basketTotal = 0;
        for (ItemDetail value : itemList) {
            if (value.getDiscountCode() == "BOGOF") {
                int number = 1 + (value.getNumber() - 1) / 2;
                basketTotal += (value.getCost() * number);
            }
            else {
                basketTotal += (value.getCost() * value.getNumber());
            }
        }
        return basketTotal;
    }

    public int get10PercentDiscountWhenTotalOver20(int basketTotal) {
        int newTotal = (basketTotal / 11) * 10;
        return newTotal;
    }

    public int get2PercentDiscountForLoyaltyCardsFinalTotal(int basketTotal) {
        int finalTotal = basketTotal * 100 /102;
        return finalTotal;
    }

    public int getCostOfBasketFinal(boolean loyaltyCard) {
        int basketTotal = getValueOfBasket();
        if (basketTotal > 2000) {
            basketTotal = get10PercentDiscountWhenTotalOver20(basketTotal);
        }
        if (loyaltyCard == true) {
            basketTotal = get2PercentDiscountForLoyaltyCardsFinalTotal(basketTotal);

        }
        return basketTotal;
    }
}
