package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("John", 1000);
        calculateScore(100);
        calculateScore();
    }

    public static int calculateScore(String playerNme, int score)
    {
        System.out.println("Player " + playerNme + " scored " + score);
        return score;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score);
        return score;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, no player score");
        return 0;
    }
}
