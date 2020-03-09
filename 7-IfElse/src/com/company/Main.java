package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000)
            System.out.println("The score is less then 5000 and greater than 1000");
        else if (score < 1000)
            System.out.println("The score is less than 1000");
        else
            System.out.println("Dunno");

        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final Score: " + finalScore);
        }
    }
}
