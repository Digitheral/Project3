package com.company;

// Olympian class
public class Olympian extends OlympianManager
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE
    }
    // Olympian information
    protected String name;
    protected Sex sex;
    protected String age;
}
