package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class StickgameEvent extends Event
{
    private int frisbeeSize = 20;
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(frisbeeSize);
    }
}
