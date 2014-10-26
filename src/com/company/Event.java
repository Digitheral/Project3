package com.company;

// Abstract Event Class
public abstract class Event extends EventManager
{
    protected String name;
    protected int playTo;
    protected boolean isPlayToExact;
    protected int playDistance;
    public abstract String getExtraInfo(); // This method is abstract and used within the child classes
}
