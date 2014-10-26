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
            myOlympian[i].sex =  Olympian.Sex.MALE;
            myOlympian[i].age = "15";
        }

    }
    // This Setter now reads from the file
    public void setOlympians() throws Exception
    {
            try
            {
                BufferedReader input = new BufferedReader(new FileReader("C:\\Olympians.lgoo"));
                String check;
                for(int i=0; i<16; i++)
                {
                    check = input.readLine();
                    String[] values = check.split(",");
                    if (!values[0].equals("LGOO"))
                    {
                        myOlympian[i].name = values[0];
                        if(values[1].equals("M") || values[1].equals("m"))
                        {
                            myOlympian[i].sex = Olympian.Sex.MALE;
                        }
                        else if(values[1].equals("F") || values[1].equals("f"))
                        {
                            myOlympian[i].sex = Olympian.Sex.FEMALE;
                        }
                        myOlympian[i].age = values[2];
                    }
                }
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("File not found.");
            }
            catch (IOException ioe)
            {
                System.out.println("Problem reading from file");
            }
        }
    public Olympian[] getOlympians()
    {
        return myOlympian;
    }
}


