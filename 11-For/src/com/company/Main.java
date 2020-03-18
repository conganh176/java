package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            System.out.println(calculateInterest(10000, i));
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * interestRate / 100);
    }
}
