package com.company;

// Base class that is called from Main for Olympians
public class OlympianManager
{
    private String[] name;
    private Olympian.Sex[] sex;
    private int[] age;

    public OlympianManager()
    {
        this.name = Olympian.name;
        this.sex = Olympian.sex;
        this.age = Olympian.age;
    }

    public Olympian getOlympians()
    {
        for (int i = 0; i < Olympian.name.length; i++)
        {
        switch (i)
        {
            case 0:
                Olympian.name[i] = "Joe";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 15;
                break;
            case 1:
                Olympian.name[i] = "Ann";
                Olympian.sex[i] = Olympian.Sex.FEMALE;
                Olympian.age[i] = 22;
                break;
            case 2:
                Olympian.name[i] = "Joe";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 15;
                break;
            case 3:
                Olympian.name[i] = "Jonathan";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 31;
                break;
            case 4:
                Olympian.name[i] = "Jarred";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 23;
                break;
            case 5:
                Olympian.name[i] = "Brian";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 31;
                break;
            case 6:
                Olympian.name[i] = "Debbie";
                Olympian.sex[i] = Olympian.Sex.FEMALE;
                Olympian.age[i] = 55;
                break;
            case 7:
                Olympian.name[i] = "Quentin";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 41;
                break;
            case 8:
                Olympian.name[i] = "Randy";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 90;
                break;
            case 9:
                Olympian.name[i] = "Howard";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 41;
                break;
            case 10:
                Olympian.name[i] = "Josie";
                Olympian.sex[i] = Olympian.Sex.FEMALE;
                Olympian.age[i] = 22;
                break;
            case 11:
                Olympian.name[i] = "Abby";
                Olympian.sex[i] = Olympian.Sex.FEMALE;
                Olympian.age[i] = 10;
                break;
            case 12:
                Olympian.name[i] = "Amanda";
                Olympian.sex[i] = Olympian.Sex.FEMALE;
                Olympian.age[i] = 15;
                break;
            case 13:
                Olympian.name[i] = "Chris";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 14;
                break;
            case 14:
                Olympian.name[i] = "Aaron";
                Olympian.sex[i] = Olympian.Sex.MALE;
                Olympian.age[i] = 23;
                break;
            default:
                break;

        }
    }
        return new Olympian();
    }
}

