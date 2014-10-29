package com.company;

// Class for Cornhole
public class CornHoleEvent extends Event
{
    private int numBeanBags;
    // Override returns above variable
    public void setNumBeanBags()
    {
        numBeanBags = 4;
    }
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numBeanBags);
    }
}
