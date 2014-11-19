package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class CompetitionManager extends Teams
{
    Competition myCompetition = new Competition(); // for Linked list
    ICompetition[] iCompetition; // for ICompetition Array
    Competition head; // Head of linked list
    Competition tail; // Tail of linked list
    int size = 0;

    CompetitionManager()
    {
        // this will begin the linked list with a null head and tail
    }
    public void StartCompetition(Event event, Teams team1, Teams team2)
    {
        // Adding to end of linked list
       myCompetition = new Competition();

       myCompetition.event = event;

        // Check for teams being in competition
       if(!team1.inCompetition)
       {
           myCompetition.team1 = team1;
           myCompetition.team1.inCompetition = true;
       }
       else
       {
           System.out.println("Your team including members " + team1.olympian1.name + " and " + team2.olympian2.name + " is already in a competiton.");
           return;
       }
       if(!team2.inCompetition)
       {
           myCompetition.team2 = team2;
           myCompetition.team2.inCompetition = true;
       }
       else
       {
           System.out.println("Your team including members " + team2.olympian1.name + " and " + team2.olympian2.name + " is already in a competiton.");
           return;
       }
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
       size++;
       System.out.println("Competition created, please view them using 'c' at the main menu");
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
            iCompetition[0] = head;
            return iCompetition;
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

        // We have to find the competition before we delete it
        findLocation();
        // Deleting the competition from the linked list
        if(myCompetition != null)
        {
            // if there is no contents in the list
            if(size == 0)
            {
                return;
            }
            // if there is only one competition in the list
            if(size == 1)
            {
                head = null;
                tail = null;
                size--;
                return;
            }
            if(tail == myCompetition)
            {
                tail = myCompetition.prevComp;
                myCompetition.nextComp = null;
            }
            else
            {
                myCompetition.prevComp.nextComp = myCompetition.nextComp.nextComp;
            }
            if(head == myCompetition)
            {
                head = head.nextComp;
                head.prevComp = null;
            }
        }
        size--;

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
