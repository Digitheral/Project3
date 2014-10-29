package com.company;

// Class for Stickgame
public class StickgameEvent extends Event
{
    private int frisbeeSize;
    // Override returns above variable
    public void setFrisbeeSize()
    {
        frisbeeSize = 20;
    }
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(frisbeeSize);
    }
}
