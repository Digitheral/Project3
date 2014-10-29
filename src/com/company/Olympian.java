package com.company;

// Olympian class
public class Olympian
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE,
        DEFAULT // Why is DEFAULT a Sex? DEFAULT is used to construct each olympian with, this will be the final check
                // to see if an Olympian is REALLY being used
    }
    // Olympian information
    protected String name;
    protected Sex sex;
    protected String age;
    protected boolean isOnATeam = false; // This is used for team matchmaking
}
