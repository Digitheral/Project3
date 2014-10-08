package com.company;

// Olympian class
public class Olympian extends OlympianManager
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE;
    }
    // Olympian information
    protected static String[] name  = new String[15];
    protected static Sex[] sex = new Sex[15];
    protected static int[] age = new int[15];
}
