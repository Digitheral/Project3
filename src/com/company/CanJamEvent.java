package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class CanJamEvent extends Event
{
    public static int frisbeeSize;
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(frisbeeSize);
    }
}
