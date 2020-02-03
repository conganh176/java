package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string.";
        System.out.println("First of all. " + myString);
        myString = myString + " And this one too.";
        System.out.println("First of all. " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("First of all, " + myString);
        String numberString = "420";
        numberString = numberString + "69";
        System.out.println("Number string: " + numberString);
        String lastString = "69";
        lastString = lastString + 420;
        System.out.println("Number string: " + lastString);
        lastString = lastString + 0.69;
        System.out.println("Number string: " + lastString);
    }
}
