package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public abstract class Event
{
    public static String name;
    public static int playTo;
    public static boolean isPlayToExact;
    public static int playDistance;
    public abstract String getExtraInfo();
}
