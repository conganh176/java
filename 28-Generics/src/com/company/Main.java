package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team<FootballPlayer> footballTeam =  new Team<>("Crow");
        footballTeam.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Pig");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beck);

        Team<FootballPlayer> basedTeam = new Team<>("Based");
        Team<FootballPlayer> notBasedTeam = new Team<>("Not based");
        basedTeam.matchResult(notBasedTeam, 1 , 0);
        basedTeam.matchResult(notBasedTeam, 9 , 6);
        notBasedTeam.matchResult(basedTeam, 6, 9);
        //notBasedTeam.matchResult(baseballTeam, 6, 6);

        System.out.println("Rankings");
        System.out.println(footballTeam.getName() + ": " + footballTeam.ranking());
        System.out.println(basedTeam.getName() + ": " + baseballTeam.ranking());
        System.out.println(notBasedTeam.getName() + ": " + notBasedTeam.ranking());

        System.out.println(footballTeam.compareTo(basedTeam));
        System.out.println(footballTeam.compareTo(notBasedTeam));
        System.out.println(basedTeam.compareTo(notBasedTeam));
        //System.out.println(footballTeam.compareTo(baseballTeam));

        ArrayList<Team> teams;
        //Collections.sort(teams);

    }
}
