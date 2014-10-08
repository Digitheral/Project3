package com.company;

// Base class that is called from Main for Olympians
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
    protected void getInfo()
    {
        String Sex[] = new String[Olympian.name.length];
        String OlympianNumber[] = new String[Olympian.name.length];
        // Iterating through every event to get the information that was stored in the constructor
        for (int i = 0; i < Olympian.name.length; i++)
        {
            // This switch statement sets the participant number
            switch(i)
            {
                case 0:
                    OlympianNumber[i] = "First";
                    break;
                case 1:
                    OlympianNumber[i] = "Second";
                    break;
                case 2:
                    OlympianNumber[i] = "Third";
                    break;
                case 3:
                    OlympianNumber[i] = "Fourth";
                    break;
                case 4:
                    OlympianNumber[i] = "Fifth";
                    break;
                case 5:
                    OlympianNumber[i] = "Sixth";
                    break;
                case 6:
                    OlympianNumber[i] = "Seventh";
                    break;
                case 7:
                    OlympianNumber[i] = "Eighth";
                    break;
                case 8:
                    OlympianNumber[i] = "Ninth";
                    break;
                case 9:
                    OlympianNumber[i] = "Tenth";
                    break;
                case 10:
                    OlympianNumber[i] = "Eleventh";
                    break;
                case 11:
                    OlympianNumber[i] = "Twelfth";
                    break;
                case 12:
                    OlympianNumber[i] = "Thirteenth";
                    break;
                case 13:
                    OlympianNumber[i] = "Fourteenth";
                    break;
                case 14:
                    OlympianNumber[i] = "Fifteenth";
                    break;
                default:
                    break;
            }
            // This switch determines the sex from the Enumeration
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
            System.out.println("The " + OlympianNumber[i] +" olympian's name is " + name[i] + ".");
            System.out.println("They are " + Sex[i] + " and " + age[i] + " years old.");
            // This takes us to get extra info about the games so we can print it below

        }
    }


    }

