package com.company;

// this exception is to check for invalid file format!

public class InvalidFormatException extends Exception
{
    private boolean isInvalid;

    public InvalidFormatException(boolean isInvalid)
    {
        super("Invalid File Format.");
        this.isInvalid = isInvalid;
    }

    public boolean getIsInvalid()
    {
        return this.isInvalid;
    }
}