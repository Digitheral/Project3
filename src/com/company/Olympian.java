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
    protected static String name;
    protected static Sex sex;
    protected static int age;
}
