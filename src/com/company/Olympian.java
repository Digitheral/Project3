package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class Olympian extends OlympianManager
{
    // Enumeration to determine the sex of the olympian
    public enum Sex
    {
        MALE,
        FEMALE;
    }
    protected static String[] name = {"Joe", "Randy", "Mark", "Brian", "Alisha", "Jenn", "Brandy", "Ann", "Brett", "Dylan", "CJ", "Peter", "Chris", "Sam", "Aaron"};
    protected static Sex[] sex = {Sex.MALE, Sex.MALE, Sex.MALE, Sex.MALE, Sex.FEMALE, Sex.FEMALE, Sex.FEMALE, Sex.FEMALE, Sex.MALE, Sex.MALE, Sex.MALE, Sex.MALE, Sex.MALE,Sex.FEMALE, Sex.MALE};
    protected static int[] age = {15, 17, 18, 10, 22, 15, 54, 61, 12, 15, 17, 18, 24, 16, 67};
}
