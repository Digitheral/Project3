package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class CompetitionManager extends Teams
{
    Competition myCompetition = new Competition(); // for Linked list
    ICompetition iCompetition = new Competition(); // for ICompetition Array
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
        if(head == null)
        {
            return null;
        }
        // Check first element for match of data
        if(head.event == myCompetition.event && head.team1 == myCompetition.team1 && head.team2 == myCompetition.team2)
        {
            iCompetition = head;
            return iCompetition[0];
        }
        // Iterating through linked list
        int i = 0;
        while(head.nextComp != null)
        {
            myCompetition = myCompetition.nextComp;
            // If we found the right competition we return it back to EndCompetition
            if(head.event == myCompetition.event && head.team1 == myCompetition.team1 && head.team2 == myCompetition.team2)
            {
                System.out.println("this exists in list");
                iCompetition[i] = myCompetition;
            }
            i++;

        }
        return null;
    }
    public void EndCompetition(Competition competition, Teams winningTeam)
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

        // We have to find the competition before we delete it
        findLocation();

    }
    public Competition findLocation()
    {
        // Check first element for null
        if(head == null)
        {
            return null;
        }
        // Check first element for match of data
        if(head.event == myCompetition.event && head.team1 == myCompetition.team1 && head.team2 == myCompetition.team2)
        {
            return head;
        }
        // Iterating through linked list
        while(head.nextComp != null)
        {
            myCompetition = myCompetition.nextComp;
            // If we found the right competition we return it back to EndCompetition
            if(head.event == myCompetition.event && head.team1 == myCompetition.team1 && head.team2 == myCompetition.team2)
            {
                System.out.println("this exists in list");
                return myCompetition;
            }
        }
        return null;
    }
}
