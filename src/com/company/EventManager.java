package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class EventManager {
    public static String[] name;
    public static int[] playTo;
    public static boolean[] isPlayToExact;
    public static int[] playDistance;

    public EventManager()
    {
        for (int i = 0; i < name.length; i++)
        {
            this.name[i] = Event.name[i];
            this.playTo[i] = Event.playTo[i];
            this.isPlayToExact[i] = Event.isPlayToExact[i];
            this.playDistance[i] = Event.playDistance[i];
        }
    }
    public Event[] getEvents()
    {
        return this.getEvents();
    }

    protected void getInfo()
    {
        for (int i = 0; i < name.length; i++)
        {
            System.out.println("This event is played to " + this.playTo[i] + " points.");
            System.out.println("This event is played at a distance of " + this.playDistance[i] + " feet.");

        }


    }
}

