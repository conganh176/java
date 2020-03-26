package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter here: ");
        String name = scanner.nextLine();
        System.out.println("You entered: " + name);

        System.out.print("Enter a number here: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt)
        {
            int number = scanner.nextInt();
            System.out.println("Add 69: " + (number + 69));
        }
        else
        {
            System.out.println("Not a number");
        }

        scanner.close();
    }
}
