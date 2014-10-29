package com.company;

// Class for CanJam
public class CanJamEvent extends Event
{
    private int frisbeeSize;
    // Override returns the above variable
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
