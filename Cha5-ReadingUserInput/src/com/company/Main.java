package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Sum of 10 numbers(Type '42069666' to skip)");
        int counter = 0;
        int sum = 0;

        while (counter < 10)
        {
            System.out.print("Enter number #" + (counter + 1) + ": ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt)
            {
                int number = scanner.nextInt();
                if (number == 42069666)        //type this number to skip
                {
                    System.out.println("Skip");
                    break;
                }
                sum += number;
                counter++;
            }
            else
            {
                System.out.println("Invalid. Try again");
            }

            scanner.nextLine();
        }

        System.out.println("Total: " + sum);

        System.out.println("Min and max input");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true)
        {
            System.out.print("Enter a number(Type a word to stop): ");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt)
            {
                int number = scanner.nextInt();

                if (number > max)
                    max = number;

                if (number < min)
                    min = number;
            }
            else
            {
                System.out.println("Typing stopped");
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

	    scanner.close();
    }
}
