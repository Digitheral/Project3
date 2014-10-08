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
    private String ExtraInfo;
    public EventManager()
    {
        this.name = Event.name;
        this.playTo = Event.playTo;
        this.isPlayToExact= Event.isPlayToExact;
        this.playDistance = Event.playDistance;
        this.ExtraInfo = "No Extra Info Currently Available";
    }
    public Event[] getEvents()
    {
        return new Event[0];
    }

    public String getInfo()
    {
        for (int i = 0; i < this.name.length; i++)
        {
            System.out.println("This event, " + name[i] + " is played to " + playTo[i] + " points.");
            System.out.println("This event, " + name[i] + " is played at a distance of " + playDistance[i] + " feet.");
            System.out.println("This event, " + name[i] + " is currently holding a boolean value of " + isPlayToExact[i] + ".");
            switch(i)
            {
                case 0:
                    WashoosEvent myWashoos = new WashoosEvent();
                    ExtraInfo = myWashoos.getExtraInfo();
                case 1:
                    // Game is Canjam
                    // Game is Horseshoes
                    // Game is Cornhole
                    // Game is Ladderball
                    // Game is Stickgame
            }

        }

        return ExtraInfo;
    }
}

