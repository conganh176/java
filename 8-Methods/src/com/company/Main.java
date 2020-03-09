package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Final score: " + CalculateScore(true, 100, 5, 100));
    }


    public static int CalculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {
        if (gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        else
        {
            return 0;
        }
    }
}
