package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class Competition implements ICompetition
{
    // This class will implement the linked list logic

    Event event;
    Teams team1;
    Teams team2;

    Competition nextComp;

    public Event getEvent()
    {
        return event;
    }
    public void setEvent(Event event)
    {
        this.event = event;
    }
    public Teams getTeam1()
    {
        return team1;
    }
    public void setTeam1(Teams team1)
    {
        this.team1 = team1;
    }
    public Teams getTeam2()
    {
        return team2;
    }
    public void setTeam2(Teams team2)
    {
        this.team2 = team2;
    }

}
