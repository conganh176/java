package com.company;

public class Main {

    public static void main(String[] args) {
	    float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("Float Min: " + floatMin);
        System.out.println("Float Max: " + floatMax);

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("Double Min: " + doubleMin);
        System.out.println("Double Max: " + doubleMax);

        int intValue = 69 / 3;
        float floatValue = 6.8f / 3f;
        double doubleValue = 420.68d / 3d;
        System.out.println("Int Value: " + intValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        double pounds = 69;
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " Pounds = " + kilograms + " Kilograms");
    }
}
