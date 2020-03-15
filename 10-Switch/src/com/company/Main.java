package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 3;

	    switch(value)
        {
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Either value 3, 4 or 5");
                System.out.println("Actually, the value is " + value);
                break;
            default:
                System.out.println("The value is not 1, 2, 3, 4, 5");
                break;
        }
    }
}
