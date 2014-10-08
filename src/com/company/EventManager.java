package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class EventManager
{
    // Information for Events
    private String[] name;
    private int[] playTo;
    private boolean[] isPlayToExact;
    private int[] playDistance;
    private String ExtraInfo;
    private String GameSpecific; // This variable is so we can make the output much nicer

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
        // Iterating through every event to get the information that was stored in the constructor
        for (int i = 0; i < name.length; i++)
        {
            System.out.println("The event " + name[i] + " is played to " + playTo[i] + " points.");
            System.out.println(name[i] + " is played at a distance of " + playDistance[i] + " feet.");
            System.out.println(name[i] + " is currently holding a boolean value of " + isPlayToExact[i] + ".");
            // This takes us to get extra info about the games so we can print it below
            getExtraInfo(i);
            switch(i)
            {
                case 0:
                    System.out.println(name[i] + " has extra info that includes a condition and a count of washoos, they are set as: " + ExtraInfo);
                    break;
                case 1:
                    System.out.println(name[i] + " has extra info that includes a frisbee size of: " + ExtraInfo);
                    break;
                case 2:
                    System.out.println(name[i] + " has extra info that includes a horseshoe count of " + ExtraInfo);
                    break;
                case 3:
                    System.out.println(name[i] + " has extra info that includes a bean bag count of " + ExtraInfo);
                    break;
                case 4:
                    System.out.println(name[i] + " has extra info that includes a count of rungs of " + ExtraInfo);
                    break;
                case 5:
                    System.out.println(name[i] + " has extra info that includes a frisbee size of " + ExtraInfo);
                    break;
                default:
                    break;
            }
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
            default:
                break;
        }
        return ExtraInfo;
    }
}


