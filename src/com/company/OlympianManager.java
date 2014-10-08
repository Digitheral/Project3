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
    protected void showInfo()
    {
        String Sex[] = new String[Olympian.name.length];
        // Iterating through every event to get the information that was stored in the constructor
        for (int i = 0; i < name.length; i++)
        {
            switch(Olympian.sex[i])
            {
                case MALE:
                    Sex[i] = "Male";
                    break;
                case FEMALE:
                    Sex[i] = "Female";
                    break;
                default:
                    break;
            }
            System.out.println("The olympian's name is " + name[i] + ".");
            System.out.println("They are " + Sex[i]+ ".");
            System.out.println("And " + age[i] + " years old.");
            // This takes us to get extra info about the games so we can print it below

        }
    }


    }

