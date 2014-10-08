package com.company;

// Class for Stickgame
public class StickgameEvent extends Event
{
    private int frisbeeSize = 20;
    // Override returns above variable
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(frisbeeSize);
    }
}
