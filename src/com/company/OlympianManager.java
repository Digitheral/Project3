package com.company;

import java.io.*;

// Base class that is called from Main for Olympians
public class OlympianManager
{
    private static Olympian[] myOlympian = new Olympian[16];
    public OlympianManager()
    {

        for(int i=0;i<16;i++)
        {
            myOlympian[i].name = "Constructed";
            myOlympian[i].sex = Olympian.Sex.MALE;
            myOlympian[i].age = "0";

        }

    }
    // This Setter now reads from the file
    public void setOlympians() throws InvalidFormatException, IOException
    {
            try
            {
                BufferedReader input = new BufferedReader(new FileReader("C:\\Olympians.lgoo"));
                String check;
                // Reading the .LGOO header just to make sure nothing happened between classes
                check = input.readLine();
                if(!check.equals("LGOO"))
                {
                    InvalidFormatException ife = new InvalidFormatException(false);
                    if(!ife.getIsInvalid())
                    {
                        throw(ife);
                    }
                }
                int i = 0;
                while(input.readLine() != null)
                {
                    check = input.readLine();
                    String[] values = new String[3];
                    // Makes sure the olympians are fully declared within the file
                    try
                    {
                        values = check.split(",");
                    }
                    catch(NullPointerException npe)
                    {
                        System.out.println("There is an error in your olympians declarations.");
                        System.exit(0);
                    }
                    // This is to make sure that the whole record is present in the file
                    if (!values[0].equals(null) || !values[1].equals(null) || !values[2].equals(null))
                    {
                        myOlympian[i].name = values[0];
                        // If structure determines sex from file input
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
                    i++;
                }
                input.close();
            }
            catch(InvalidFormatException ife)
            {
                System.out.println("File is an invalid format.");
                System.exit(0);
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("File not found.");
                System.exit(0);
            }
            catch (IOException ioe)
            {
                System.out.println("Problem reading from file");
                System.exit(0);
            }
        }
    public Olympian[] getOlympians()
    {
        return myOlympian;
    }
}


