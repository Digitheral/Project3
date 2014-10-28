package com.company;

import java.util.Random; // to assign teams

/**
 * Created by Art on 10/26/2014.
 */
public class TeamManager extends Teams
{
    private static Teams[] myTeams;
    // Constructor
    public TeamManager(Olympian[] myOlympians)
    {
        myTeams[0].olympian1 =  null;
        myTeams[0].olympian2 = null;
        myTeams[0].wins = 5;
        myTeams[0].losses = 2;
    }
    public void setTeams()
    {
       
    }
    public Teams[] getTeams()
    {
        return myTeams;
    }
}
