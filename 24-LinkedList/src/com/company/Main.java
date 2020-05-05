package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Kongu", 420.69);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(69.42);
        System.out.println("Balance of " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + ": " + intList.get(i));

        intList.add(1, 69);

        for (int i = 0; i < intList.size(); i++)
            System.out.println(i + ": " + intList.get(i));
    }
}
