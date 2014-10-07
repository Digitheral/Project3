package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public abstract class Event extends EventManager
{
    public static String[] name = {"Washoos", "Canjam", "Horseshoes", "Cornhole", "Ladderball", "Stickgame"};
    public static int[] playTo = {21, 21, 11, 21, 21, 11};
    public static boolean[] isPlayToExact = {false ,false, false, false, false, false};
    public static int[] playDistance = {15, 50, 40, 27, 15, 25};
    public abstract String getExtraInfo();
}
