package com.company;

public class Main {

    public static void main(String[] args) {
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Min Int: " + minInt);
        System.out.println("Max Int: " + maxInt);

        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Min Byte: " + minByte);
        System.out.println("Max Byte: " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Min Short: " + minShort);
        System.out.println("Max Short: " + maxShort);

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Min Long: " + minLong);
        System.out.println("Max Long: " + maxLong);

        int intMath = maxInt / 2;
        byte byteMath = (byte) (maxByte / 2);
        short shortMath = (short) (maxShort/ 2);
        long longMath = maxLong / 2;
        System.out.println("Int: " + intMath);
        System.out.println("Byte: " + byteMath);
        System.out.println("Short: " + shortMath);
        System.out.println("Long: " + longMath);

        int INT = 42069;
        byte BYTE = 69;
        short SHORT = 420;
        long LONG = 50000L + 10L * (BYTE + SHORT + INT);
        System.out.println("Math value: " + LONG);
    }
}
