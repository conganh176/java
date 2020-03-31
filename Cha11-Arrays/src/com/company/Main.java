package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int nums;
        while (true)
        {
            System.out.print("Enter numbers of value: ");
            if (scanner.hasNextInt())
            {
                nums = scanner.nextInt();
                break;
            }
        }

        int[] myInts = getInts(nums);
        int[] sortedArray = sortArray(myInts);
        printArray(sortedArray);
    }

    public static int[] getInts(int nums)
    {
        int[] array = new int[nums];
        int i = 0;

        while (i < array.length)
        {
            System.out.print("Enter value of " + i +": ");
            if (scanner.hasNextInt())
            {
                array[i] = scanner.nextInt();
                i++;
            }
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        System.out.println("Print Array");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] sortArray(int[] array)
    {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++)
//            sortedArray[i] = array[i];

        int[] sortedArray = Arrays.copyOf(array, array.length);

        //start sorting here
        int temp;

        for (int i = 0; i < sortedArray.length - 1; i++)
        {
            for (int j = i + 1; j < sortedArray.length; j++)
            {
                if (sortedArray[i] > sortedArray[j])
                {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }
}
