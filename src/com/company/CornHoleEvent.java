package com.company;

// Class for Cornhole
public class CornHoleEvent extends Event
{
    private int numBeanBags = 4;
    // Override returns above variable
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numBeanBags);
    }
}
