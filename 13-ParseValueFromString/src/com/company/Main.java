package com.company;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2020";
        int number = Integer.parseInt(numberAsString);

        numberAsString += 1;
        number += 1;

        System.out.println("String: " + numberAsString);
        System.out.println("Number: " + number);

        String decimalNumberAsString = "2020.04";
        double decimalNumber = Double.parseDouble(decimalNumberAsString);

        decimalNumberAsString += 1;
        decimalNumber += 1;

        System.out.println("String: " + decimalNumberAsString);
        System.out.println("Number: " + decimalNumber);
    }
}
