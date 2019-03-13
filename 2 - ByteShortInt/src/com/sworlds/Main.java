package com.sworlds;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        byte myNewByteValue = (byte) (myMinByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myMinShortValue = -32_768;
        short myMaxShortValue = 32_767;
        short myNewShortValue = (short) (myMinShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (myMinLongValue/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        long myLongValue = 50000L + 10 * (myMaxByteValue + myMaxValue + myMaxShortValue);
        short myShortValue = (short) (1000 + 10 * (myMaxByteValue + myMaxValue + myMaxShortValue));
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("myShortValue = " + myShortValue);

    }
}
