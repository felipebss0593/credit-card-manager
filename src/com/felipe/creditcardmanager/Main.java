package com.felipe.creditcardmanager;

import com.felipe.creditcardmanager.model.Card;
import com.felipe.creditcardmanager.model.Customer;
import com.felipe.creditcardmanager.model.Purchase;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Felipe");

        Card card1 = new Card(customer1);

        Purchase purchase1 = new Purchase(500,"Calça da Renner");

        card1.addPurchase(purchase1);

        System.out.println(card1);
    }
}
