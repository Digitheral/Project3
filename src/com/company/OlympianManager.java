package com.company;

import java.io.*;
import java.util.ArrayList;

// Base class that is called from Main for Olympians
public class OlympianManager extends Olympian
{
    // Default size for olympian array
    protected Olympian[] myOlympian = new Olympian[100];
    public OlympianManager(int fileLength)
    {
        if(fileLength > 100)
        {
            myOlympian = new Olympian[fileLength];
        }
        for(int i=0;i<fileLength;i++)
        {
            myOlympian[i] = new Olympian();
            this.myOlympian[i].name = "Default";
            this.myOlympian[i].sex = Sex.MALE;
            this.myOlympian[i].age = "0";

        }
    }
    // This Setter now reads from the file
    public void setOlympians(int fileLength, String args) throws InvalidFormatException, NullPointerException, IOException
    {
        try
        {
            BufferedReader input = new BufferedReader(new FileReader(args));

            try
            {
                String check;
                // Reading the .LGOO header just to make sure nothing happened between classes
                check = input.readLine();
                try
                {
                    if (!check.equals("LGOO"))
                    {
                        InvalidFormatException ife = new InvalidFormatException(false);
                        if (!ife.getIsInvalid())
                        {
                            throw (ife);
                        }
                    }
                }
                catch (NullPointerException npe)
                {
                    System.out.println("Problem reading from file. Check to see the data is correct.");
                    System.out.println("Ending Program.");
                    System.exit(0);
                }
                int i = 0;
                while (i < fileLength)
                {
                    // Begins file reading
                    check = input.readLine();
                    String[] values = new String[3];
                    // Makes sure the olympians are fully declared within the file
                    try
                    {
                        // File is delimited by commas, this splits it apart
                        values = check.split(",");
                    }
                    catch (NullPointerException npe)
                    {
                        System.out.println("There is an error in your olympians file.");
                        System.out.println("Ending Program.");
                        System.exit(0);
                    }
                    // This is to make sure that the whole record is present in the file
                    if (values[0] != null && values[1] != null && values[2] != null)
                    {
                        myOlympian[i].name = values[0];
                        // If structure determines sex from file input
                        if (values[1].equals("M") || values[1].equals("m"))
                        {
                            myOlympian[i].sex = Olympian.Sex.MALE;
                        }
                        else if (values[1].equals("F") || values[1].equals("f"))
                        {
                            myOlympian[i].sex = Olympian.Sex.FEMALE;
                        }
                    }
                    myOlympian[i].age = values[2];
                    i++;
                }
            }
            catch (InvalidFormatException ife)
            {
                System.out.println("File is an invalid format.");
                System.out.println("Ending Program.");
                System.exit(0);
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("File not found.");
                System.out.println("Ending Program.");
                System.exit(0);
            }
            catch (IOException ioe)
            {
                System.out.println("Problem reading from file");
                System.out.println("Ending Program.");
                System.exit(0);
            }
            finally
            {
                input.close();
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
            System.out.println("Ending Program.");
            System.exit(0);
        }
    }
    public Olympian[] getOlympians()
    {
        return myOlympian;
    }
}


