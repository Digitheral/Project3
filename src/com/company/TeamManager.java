package com.company;

import java.util.Random; // to assign teams

/**
 * Created by Art on 10/26/2014.
 */
public class TeamManager extends Teams
{
    private Teams[] myTeams = new Teams[99];
    // Constructor
    public TeamManager(Olympian[] myOlympians, int fileLength)
    {
        for(int i=0; i< fileLength; i++)
        {
            myTeams[i] = new Teams();
            myTeams[i].olympian1 = myOlympians[i];
            myTeams[i].olympian2 = myOlympians[i];
            myTeams[i].wins = 0;
            myTeams[i].losses = 0;
        }
    }
    public void setTeams(Olympian[] myOlympians, int fileLength)
    {
        // Variable that holds the amount of teams
        int TeamCount = fileLength / 2;
        // Random generator for teams
       Random rand = new Random();
       int n = rand.nextInt(fileLength) + 1;

    }
    public Teams[] getTeams()
    {
        return myTeams;
    }
}
