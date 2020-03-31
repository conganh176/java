package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    int[] myIntArray = new int[10];
        myIntArray[5] = 69;

        System.out.print("Print myIntArray: ");
        printArray(myIntArray);

        int[] myOtherIntArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("\nPrint myOtherIntArray: ");
        printArray(myOtherIntArray);

        int numsOfValue;
        while (true)
        {
            System.out.print("\nEnter number of value: ");
            if (scanner.hasNextInt())
            {
                numsOfValue = scanner.nextInt();
                break;
            }
        }
        int[] myOwnArray = getInts(numsOfValue);

        System.out.println("Average: " + getAverage(myOwnArray));
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] getInts(int number)
    {
        System.out.print("Enter " + number + " values: ");
        int[] newArray = new int[number];
        for (int i = 0; i < newArray.length; i++)
        {
            newArray[i] = scanner.nextInt();
        }

        return newArray;
    }

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }
}
