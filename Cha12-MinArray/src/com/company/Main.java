package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nums = 0;
        while (true)
        {
            System.out.print("Enter numbers of elements: ");
            if (scanner.hasNextInt())
            {
                nums = scanner.nextInt();
                break;
            }
        }

        int[] returnedArray = readInts(nums);
        System.out.print("Min: " + findMin(returnedArray));
    }

    private static int[] readInts(int count)
    {
        int[] array = new int[count];
        int i = 0;

        while (i < array.length)
        {
            System.out.print("Enter a number of element " + i + ": ");
            if (scanner.hasNextInt())
            {
                array[i] = scanner.nextInt();
                i++;
            }
        }

        return array;
    }

    private static int findMin(int[] array)
    {
        int min = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }

        return min;
    }
}
