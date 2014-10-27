package com.company;

// Olympian class
public class Olympian
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE,
        DEFAULT
    }
    // Olympian information
    protected String name;
    protected Sex sex;
    protected String age;
}
