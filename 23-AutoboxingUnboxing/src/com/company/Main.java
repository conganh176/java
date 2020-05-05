package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Kongu");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(69));
        Integer integer = new Integer(69);
        Double doubleValue = new Double(420.69);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++)
            integerArrayList.add(Integer.valueOf(i));

        for (int i = 0; i <= 10; i++)
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());

        Integer myIntegerValue = 69;        //Integer myIntegerValue = Integer.valueOf(69);
        int myInt = myIntegerValue;         //myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5)
            myDoubleValues.add(dbl);        //myDoubleValues.add(Double.valueOf(dbl));

        for (int i = 0; i < myDoubleValues.size(); i++)
        {
            double value = myDoubleValues.get(i);     //myDoubleValues.get(i).doubleValue()
            System.out.println(i + " --> " + value);
        }
    }
}
