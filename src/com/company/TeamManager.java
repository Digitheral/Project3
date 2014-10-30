package com.company;

import java.util.Random; // to assign teams

/**
 * Created by Art on 10/26/2014.
 */
public class TeamManager extends Teams
{
    // Default size for team array
    private Teams[] myTeams = new Teams[100];
    // Counters for team pairing
    protected int male = 0;
    protected int female = 0;
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
            if(myOlympians[i].sex == Sex.MALE)
            {
                male++;
            }
            else
            {
                female++;
            }
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
            // These randomizers randomly choose olympians
            int n = rand.nextInt(fileLength);
            int m = rand.nextInt(fileLength);
            myTeams[i].olympian1 = myOlympians[n];
            myTeams[i].olympian2 = myOlympians[m];
            // This matches the olympians onto teams and makes sure they aren't on multiple teams and
            // so that males and females are matched correctly
            // This should make sure that if there is any ratio of males to females they will be assigned to teams
            if(!myTeams[i].olympian1.name.equals(myTeams[i].olympian2.name) && myTeams[i].olympian1.sex != myTeams[i].olympian2.sex && !myTeams[i].olympian1.isOnATeam && !myTeams[i].olympian2.isOnATeam && (male != 0 ||  female != 0))
            {
               myTeams[i].olympian1.isOnATeam = true;
               myTeams[i].olympian2.isOnATeam = true;
               int wins = rand.nextInt(50) + 1; // random number for wins
               int losses = rand.nextInt(50) + 1; // random number for losses
               myTeams[i].wins = wins;
               myTeams[i].losses = losses;
               i++;
               male--;
               female--;
            }
            else if((male == 0 || female == 0) && !myTeams[i].olympian1.name.equals(myTeams[i].olympian2.name) && !myTeams[i].olympian1.isOnATeam && !myTeams[i].olympian2.isOnATeam)
            {
                myTeams[i].olympian1.isOnATeam = true;
                myTeams[i].olympian2.isOnATeam = true;
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
