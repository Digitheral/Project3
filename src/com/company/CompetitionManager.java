package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class CompetitionManager extends Teams
{
    Competition myCompetition = new Competition();
    Competition head; // Head of linked list
    Competition tail; // Tail of linked list

    CompetitionManager()
    {
        // this will begin the linked list with a null head and tail
    }
    public void StartCompetition(Event event, Teams team1, Teams team2)
    {
        // Adding to end of linked list
       myCompetition = new Competition();
       myCompetition.event = event;
       myCompetition.team1 = team1;
       myCompetition.team2 = team2;
       // Updating linked list
       if(tail == null)
       {
           head = myCompetition;
           tail = myCompetition;
       }
       else
       {
           tail.nextComp = myCompetition;
           tail = myCompetition;
       }
    }
    public ICompetition[] getCompetitions()
    {
       // will getCompetitions to show in the c command
      return null;
    }
    public void EndCompetition(ICompetition competition, Teams winningTeam)
    {
        // Calculates wins and losses
        winningTeam.wins++;
        if(winningTeam != myCompetition.team1)
        {
            myCompetition.team1.losses++;
        }
        else
        {
            myCompetition.team2.losses++;
        }
        // End comp with linked list

        // empty linked list
        // non empty linked list
    }
}
