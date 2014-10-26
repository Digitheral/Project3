package com.company;

// Class for Washoos
public class WashoosEvent extends Event
{
    private boolean hasAutoWinStick = false;
    private int numWashoos = 5;
    /* Override returns above variables, this override is slightly different than the others. We concatenate both of the
    variables provided to return them. First we convert them to strings, then concatenate, then return. */
    @Override
    public String getExtraInfo()
    {
        String returnString1 = Boolean.toString(hasAutoWinStick);
        String returnString2 = Integer.toString(numWashoos);
        return returnString1.concat(" " + returnString2);
    }
}
