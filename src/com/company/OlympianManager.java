package com.company;

/**
 * Created by Art on 10/7/2014.
 */
public class OlympianManager
{
    protected String[] name;
    protected Olympian.Sex[] sex;
    protected int[] age;
    public OlympianManager()
    {
        this.name = Olympian.name;
        this.sex = Olympian.sex;
        this.age = Olympian.age;
    }
    public Olympian[][] getOlympians()
    {
        return new Olympian[15][2];
    }
    public void showInfo()
    {
        
    }
}
