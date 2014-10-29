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
        int i = 0; // For indexing in the array, but we will be using it a bit differently than a normal for loop
        while (i < TeamCount)
        {
            // While the counter, i is less than the fileLength we will continue this loop
            int save = -1; // This will be used to make sure no olympians get onto the same team
            int n = rand.nextInt(fileLength) + 1;
            int m = rand.nextInt(fileLength) + 1;
            // This matches the olympians onto teams and makes sure they aren't on multiple teams
            if(n!=m && !myOlympians[n].isOnATeam && !myOlympians[m].isOnATeam && myOlympians[n].sex != myOlympians[m].sex)
            {
                myTeams[i].olympian1 = myOlympians[n];
                myOlympians[n].isOnATeam = true;
                myTeams[i].olympian2 = myOlympians[m];
                myOlympians[m].isOnATeam = true;
                int wins = rand.nextInt(50) + 1; // random number for wins
                int losses = rand.nextInt(50) + 1; // random number for losses
                myTeams[i].wins = wins;
                myTeams[i].losses = losses;
                i++;
            }

        }
    }
    public Teams[] getTeams()
    {
        return myTeams;
    }
}
