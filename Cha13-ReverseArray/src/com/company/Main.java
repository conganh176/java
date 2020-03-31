package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
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
        System.out.println("Array: " + Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("Reverse Array: " + Arrays.toString(returnedArray));

        reverse(returnedArray);
        System.out.println("Reverse Array back: " + Arrays.toString(returnedArray));
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

    public static void reverse(int[] array)
    {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++)
        {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
