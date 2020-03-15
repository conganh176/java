package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(-1);

    }

    public static void printDayOfTheWeek(int day)
    {
        switch(day)
        {
            case 0:
                System.out.print("Sunday\n");
                break;
            case 1:
                System.out.print("Monday\n");
                break;
            case 2:
                System.out.print("Tuesday\n");
                break;
            case 3:
                System.out.print("Wednesday\n");
                break;
            case 4:
                System.out.print("Thursday\n");
                break;
            case 5:
                System.out.print("Friday\n");
                break;
            case 6:
                System.out.print("Saturday\n");
                break;

            default:
                System.out.println("Invalid day\n");
                break;
        }
    }
}
