package com.company;

// Class for Horseshoes
public class HorseshoesEvent extends Event
{
    private static int numHorseShoes = 2;
    // Override returns above variable
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numHorseShoes);
    }
}
