package com.codeclan.example.shoppingbasket;

/**
 * Created by user on 11/06/2017.
 */

class Customer {

    private String name;
    private String loyaltyCardNumber;

    public  Customer(String name, String loyaltyCardNumber) {
            this.name = name;
            this.loyaltyCardNumber = loyaltyCardNumber;
        }

    public String getName() {
        return this.name;
    }

    public String getloyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    public boolean getCustomerLoyaltyCardDetails() {
        if (this.loyaltyCardNumber != "") {
            return true;
        }
        return false;
    }

}
