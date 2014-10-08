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

    // Constructor for Class EventManager
    public EventManager()
    {
        this.name = Event.name;
        this.playTo = Event.playTo;
        this.isPlayToExact = Event.isPlayToExact;
        this.playDistance = Event.playDistance;
        this.ExtraInfo = "No Extra Info Currently Available";
    }

    // Gets Event Object
    public Event[] getEvents()
    {
        return new Event[this.name.length];
    }
    // Gets info from the Abstract Event Class and Subclasses beneath that (ExtraInformation)
    protected void getInfo()
    {
        for (int i = 0; i < name.length; i++) {
            System.out.println("This event, " + name[i] + " is played to " + playTo[i] + " points.");
            System.out.println("This event, " + name[i] + " is played at a distance of " + playDistance[i] + " feet.");
            System.out.println("This event, " + name[i] + " is currently holding a boolean value of " + isPlayToExact[i] + ".");
            getExtraInfo(i);
            System.out.println("This event, " + name[i] + " has extra info that includes: " + ExtraInfo);
        }
    }
    // Method to retrieve ExtraInformation.
    public String getExtraInfo(int i)
    {
        switch (i)
        {
            case 0:
                // Game is Washoos
                WashoosEvent myWashoos = new WashoosEvent();
                ExtraInfo = myWashoos.getExtraInfo();
                break;
            case 1:
                // Game is Canjam
                CanJamEvent myCanjam = new CanJamEvent();
                ExtraInfo = myCanjam.getExtraInfo();
                break;
            case 2:
                // Game is Horseshoes
                HorseshoesEvent myHorseshoes = new HorseshoesEvent();
                ExtraInfo = myHorseshoes.getExtraInfo();
                break;
            case 3:
                // Game is Cornhole
                CornHoleEvent myCornhole = new CornHoleEvent();
                ExtraInfo = myCornhole.getExtraInfo();
                break;
            case 4:
                // Game is Ladderball
                LadderBallEvent myLadderball = new LadderBallEvent();
                ExtraInfo = myLadderball.getExtraInfo();
                break;
            case 5:
                // Game is Stickgame
                StickgameEvent myStickgame = new StickgameEvent();
                ExtraInfo = myStickgame.getExtraInfo();
                break;
        }
        return ExtraInfo;
    }
}


