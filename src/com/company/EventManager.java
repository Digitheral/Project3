package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class EventManager
{
    public static String[] name;
    public static int[] playTo;
    public static boolean[] isPlayToExact;
    public static int[] playDistance;
    public EventManager()
    {
        this.name = Event.name;
        this.playTo = Event.playTo;
        this.isPlayToExact= Event.isPlayToExact;
        this.playDistance = Event.playDistance;
    }
    public String[] getEvents()
    {
        return this.name;
    }

    protected void getInfo()
    {
        for (int i = 0; i < this.name.length; i++)
        {
            System.out.println("This event is played to " + this.playTo[i] + " points.");
            System.out.println("This event is played at a distance of " + this.playDistance[i] + " feet.");

        }


    }
}

