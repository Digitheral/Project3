package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class HorseshoesEvent extends Event
{
    private static int numHorseShoes = 2;
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numHorseShoes);
    }
}
