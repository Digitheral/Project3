// Program: Project III - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development
package com.company;

import java.io.*;
public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args) throws InvalidFormatException, IOException
    {
        int fileLength = 0; // To count the number of olympians in the file, this will be used for the constructor
        // This is checking the file before we go any further
        // If the file is not correct - there's no reason to go any further.
        BufferedReader input = new BufferedReader(new FileReader("C:\\Olympians.lgoo"));
        try
        {
            // This begins the file type checking
            String check;
            check = input.readLine();
            if (check.equals("LGOO"))
            {
                System.out.println("Your input file is good!");
                while(check != null)
                {
                    check = input.readLine();
                    if(check != null) // Prevents null record from being added to total records
                    {
                        fileLength++;
                    }
                }
                System.out.println("File length is " + fileLength + " records.");
            }
            // Checks for invalid file format
            else if (!check.equals("LGOO"))
            {
                InvalidFormatException ife = new InvalidFormatException(false);
                if (!ife.getIsInvalid())
                {
                    throw (ife);
                }
            }
            // Checks to make sure something is in the file
            else if (!check.equals(null))
            {
                throw new IOException();
            }

        }
        catch(InvalidFormatException ife)
        {
            System.out.println("File is an invalid format.");
            System.exit(0);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found, please check that the file exists or that your are permitted to view the file.");
            System.exit(0);
        }
        catch(IOException ioe)
        {
            System.out.println("Problem reading from file");
            System.exit(0);
        }
        finally
        {
            input.close();
        }
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");
        // Now accepts input from console
        // This is the block for console input, we get the input via a buffered reader and check it against the needed arguments
        // when 'q' or 'quit' is input we end the cycle.
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader consoleInput = new BufferedReader(isr);

            String inputLine = " ";
            while (consoleInput != null)
            {
                System.out.println("\nPlease input an argument: ");
                inputLine = consoleInput.readLine();
                if(inputLine.equals("e") || inputLine.equals("events"))
                {
                    System.out.println("\nEVENT LISTING AND DESCRIPTION.\n");
                    EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
                    System.out.println("This is the listing and description of each event: ");
                    myEventManager.setEvents();
                    Event[] myEvents = myEventManager.getEvents();
                    displayEvents(myEvents);
                }
                else if(inputLine.equals("o")|| inputLine.equals("olympians"))
                {
                    // We pass fileLength around here to make sure the Olympians array is the right length
                    System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
                    System.out.println("This is the listing for each olympian: ");
                    OlympianManager myOlympianManager = new OlympianManager(fileLength); // Instantiating the OlympianManager class
                    myOlympianManager.setOlympians(fileLength);
                    Olympian[] myOlympians = myOlympianManager.getOlympians(); // Instantiating an Olympian class so OlympianManager can retrieve
                    displayOlympians(myOlympians, fileLength);
                }
                else if(inputLine.equals("t")|| inputLine.equals("teams"))
                {
                    System.out.println("\nTEAM LISTINGS\n");
                    System.out.println("This is the listing for each team: ");
                    // Olympian Manager object is instantiated in case Teams are chosen before Olypmians
                    // You can't have teams without olympians
                    OlympianManager myOlympianManager = new OlympianManager(fileLength); // Instantiating the OlympianManager class
                    myOlympianManager.setOlympians(fileLength);
                    Olympian[] myOlympians = myOlympianManager.getOlympians(); // Instantiating an Olympian class so OlympianManager can retrieve

                    TeamManager myTeamManager = new TeamManager(myOlympians, fileLength);
                    myTeamManager.setTeams(myOlympians, fileLength);
                    Teams[] myTeams = myTeamManager.getTeams();
                    displayTeams(myTeams, fileLength);

                }
                else if(inputLine.equals("h")|| inputLine.equals("help"))
                {
                    help(); // calls the help method
                }
                else if(inputLine.equals("q") || inputLine.equals("quit"))
                {
                    System.out.println("Ending Program.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Invalid argument, please try again.");
                }
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Input error");
        }
        finally
        {
            input.close();
        }
    }
    // Help menu
    public static void help()
    {
        System.out.println("\nHELP MENU.\n");
        System.out.println("Welcome to the Help menu.");
        System.out.println("On the splash screen input 'e' or 'events' to view today's events.");
        System.out.println("Input 'o' or 'olympians' to view the status of all olympians.");
        System.out.println("You figured out how to get here by typing 'h' or 'help'.");
    }
    // This method displays the array of Event objects
    public static void displayEvents(Event[] myEvents)
    {
        for(int i=0; i < myEvents.length;i++)
        {
            System.out.println("The game: " + myEvents[i].name + " is played to "+ myEvents[i].playTo + " points.");
            System.out.println("It is played at a distance of " + myEvents[i].playDistance + " and holds a boolean value of " + myEvents[i].isPlayToExact);
            System.out.println("Extra info includes: " + myEvents[i].getExtraInfo());
        }
    }
    // This method displays the array of Olympian objects
    public static void displayOlympians(Olympian[] myOlympians, int fileLength)
    {
        for(int i=0; i < fileLength; i++)
        {
            System.out.println("Name: " + myOlympians[i].name);
            System.out.println("Sex: " + myOlympians[i].sex);
            System.out.println("Age: " + myOlympians[i].age);
        }

    }
    // This method displays the array of Team objects
    public static void displayTeams(Teams[] myTeams, int fileLength)
    {
        for(int i=0; i< fileLength / 2 ; i++)
        {
            System.out.println("Olympian 1: " + myTeams[i].olympian1.name);
            System.out.println("Olympian 2: " + myTeams[i].olympian2.name);
            System.out.println("Wins: " + myTeams[i].wins);
            System.out.println("Losses: " + myTeams[i].losses);
        }
    }
}


