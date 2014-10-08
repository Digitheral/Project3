package com.company;

// Abstract Event Class
public abstract class Event extends EventManager
{
    protected static String[] name = {"Washoos", "Canjam", "Horseshoes", "Cornhole", "Ladderball", "Stickgame"};
    protected static int[] playTo = {21, 21, 11, 21, 21, 11};
    protected static boolean[] isPlayToExact = {false ,false, false, false, false, false};
    protected static int[] playDistance = {15, 50, 40, 27, 15, 25};
    public abstract String getExtraInfo();
}
