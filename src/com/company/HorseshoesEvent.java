package com.company;

// Class for Horseshoes
public class HorseshoesEvent extends Event
{
    private static int numHorseShoes;
    // Override returns above variable
    public void setNumHorseShoes()
    {
        numHorseShoes = 2;
    }
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numHorseShoes);
    }
}
