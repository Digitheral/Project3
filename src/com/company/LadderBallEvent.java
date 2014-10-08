package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class LadderBallEvent extends Event
{
    private int numRungs = 3;
    @Override
    public String getExtraInfo()
    {
        return Integer.toString(numRungs);
   }
}
