package com.company;

// Class for Washoos
public class WashoosEvent extends Event
{
    private boolean hasAutoWinStick = false;
    private int numWashoos = 5;
    protected String returnString1;
    protected String returnString2;
    /* Override returns above variables, this override is slightly different than the others. We concatenate both of the
    variables provided to return them. First we convert them to strings, then concatenate, then return. */
    @Override
    public String getExtraInfo()
    {
        returnString1 = Boolean.toString(hasAutoWinStick);
        returnString2 = Integer.toString(numWashoos);
        return returnString1.concat(" " + returnString2);
    }
}
