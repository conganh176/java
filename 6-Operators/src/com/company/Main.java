package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 0;
        System.out.println(result);
        result++;
        System.out.println(result);
        result -= 2;
        System.out.println(result);
        result *= -2;
        System.out.println(result);

        boolean isAlive = true;
        if (isAlive)
        {
            System.out.println("Is Alive");
            System.out.println("Still Alive");
        }

        int topScore = 100;
        int passedFirstScore = 70;
        int secondScore = 40;
        int passedSecondScore = 30;
        int thirdScore = 20;
        int passedThirdScore = 60;
        if (topScore >= passedFirstScore && secondScore >= passedSecondScore)
        {
            System.out.println("You passed.");
        }

        if (topScore < passedFirstScore || thirdScore < passedThirdScore)
        {
            System.out.println("You failed");
        }

        int age = 20;
        int legalAge = 18;
        boolean isLegal = age >= legalAge ? true : false;
        System.out.println("Is legal: " + isLegal);

        double doubleVar = 20.00;
        double doubleVar2 = 80.00;
        double doubleResult = (doubleVar + doubleVar2) * 100.00;
        System.out.println("Result: " + doubleResult);
        double remainder = doubleResult % 40.00;
        System.out.println("Remainder: " + remainder);
        boolean isNotRemainder = (remainder == 0) ? true : false;
        System.out.println("Is Not Remainder: " + isNotRemainder);
        if (!isNotRemainder)
        {
            System.out.println("Have remainder.");
        }
    }
}
