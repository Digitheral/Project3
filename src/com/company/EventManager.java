package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class EventManager
{
    private String[] name;
    private int[] playTo;
    private boolean[] isPlayToExact;
    private int[] playDistance;
    public EventManager()
    {
        this.name = Event.name;
        this.playTo = Event.playTo;
        this.isPlayToExact= Event.isPlayToExact;
        this.playDistance = Event.playDistance;
    }
    public Event[] getEvents()
    {
        return new Event[0];
    }

    protected void getInfo()
    {
        for (int i = 0; i < this.name.length; i++)
        {

            System.out.println("This event, " + this.name[i] + " is played to " + this.playTo[i] + " points.");
            System.out.println("This event, " + this.name[i] + " is played at a distance of " + this.playDistance[i] + " feet.");
            System.out.println("This event, " + this.name[i] + " is currently holding a boolean value of " + this.isPlayToExact[i] + ".");

        }
    }
}

