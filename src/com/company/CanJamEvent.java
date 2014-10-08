package com.company;

// Class for CanJam
public class CanJamEvent extends Event
{
    private int frisbeeSize = 20;
    // Override returns the above variable
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(frisbeeSize);
    }
}
