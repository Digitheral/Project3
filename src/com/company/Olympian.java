package com.company;

// Olympian class
public class Olympian
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE,
    }
    // Olympian information
    protected String name;
    protected Sex sex;
    protected String age;
    protected boolean isOnATeam = false; // This is used for team matchmaking
}
