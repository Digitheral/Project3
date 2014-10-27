package com.company;

// Olympian class
public class Olympian
{
    public Olympian()
    {
        this.name = "Constructed";
        this.sex = Sex.MALE;
        this.age = "15";
    }
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
