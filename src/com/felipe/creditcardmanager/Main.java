package com.felipe.creditcardmanager;

import com.felipe.creditcardmanager.model.Card;
import com.felipe.creditcardmanager.model.Customer;
import com.felipe.creditcardmanager.model.Purchase;
import com.felipe.creditcardmanager.model.PurchaseValueComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Felipe");

        Card card1 = new Card(customer1);

        Purchase purchase1 = new Purchase(500,"Calça da Renner",2);

        Purchase purchase2 = new Purchase(2500,"PS5",5);

        Purchase purchase3 = new Purchase(100, "Lanche",1);

        ArrayList<Purchase> listaTeste = new ArrayList<>();
        listaTeste.add(purchase1);
        listaTeste.add(purchase2);
        listaTeste.add(purchase3);

        Collections.sort(listaTeste);
        Collections.sort(listaTeste, new PurchaseValueComparator());

        card1.addPurchase(purchase1);
        card1.addPurchase(purchase2);

        System.out.println(card1);
        System.out.println(listaTeste);
        System.out.println(customer1.getTotalSpent());
    }
}
