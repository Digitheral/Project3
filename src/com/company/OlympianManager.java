package com.company;

import java.io.*;

// Base class that is called from Main for Olympians
public class OlympianManager
{
    private static Olympian[] myOlympian = new Olympian[16];
    public OlympianManager()
    {
        for(int i=0; i< myOlympian.length; i++)
        {
            myOlympian[i].name = "Smith";
            myOlympian[i].sex = Olympian.Sex.MALE;
            myOlympian[i].age = 0;
        }

    }
    public void setOlympians() throws Exception
    {
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Olympians.lgoo"));
            String check;
            check = input.readLine();
            System.out.println(check);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
        catch(IOException ioe)
        {
            System.out.println("Problem reading from file");
        }
        for (int i = 0; i < 16; i++)
        {

            switch (i)
            {
                case 0:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 1:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 2:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 3:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 4:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 5:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 6:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 7:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 8:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 9:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 10:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 11:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 12:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 13:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 14:
                    myOlympian[i].name = "Bob";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                case 15:
                    myOlympian[i].name = "Bob15";
                    myOlympian[i].sex = Olympian.Sex.MALE;
                    myOlympian[i].age = 15;
                    break;
                default:
                    break;
            }
        }
    }

    public Olympian[] getOlympians()
    {
        return myOlympian;
    }
}


