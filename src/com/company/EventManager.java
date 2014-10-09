package com.company;

// Base class that is called from main for Events
public class EventManager {
    // Information for Events
    protected String[] name;
    protected int[] playTo;
    protected boolean[] isPlayToExact;
    protected int[] playDistance;
    private String ExtraInfo;
    private String GameSpecific; // This variable is so we can make the output much nicer

    // Constructor for Class EventManager
    public EventManager() {
        this.name = Event.name;
        this.playTo = Event.playTo;
        this.isPlayToExact = Event.isPlayToExact;
        this.playDistance = Event.playDistance;
        this.ExtraInfo = "No Extra Info Currently Available";
    }

    // Gets Event Object - See Main Class Comments
    public Event getEvents(int arg) {
        switch (arg) {
            case 0:
                WashoosEvent.name = name;
                return new WashoosEvent();
            case 1:
                CanJamEvent.name = name;
                return new CanJamEvent();
            case 2:
                HorseshoesEvent.name = name;
                return new HorseshoesEvent();
            case 3:
                CornHoleEvent.name = name;
                return new CornHoleEvent();
            case 4:
                LadderBallEvent.name = name;
                return new LadderBallEvent();
            case 5:
                StickgameEvent.name = name;
                return new StickgameEvent();
            default:
                break;
        }
        return null;
    }

}