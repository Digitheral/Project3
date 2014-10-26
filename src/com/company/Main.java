// Program: Project III - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development
package com.company;


import com.sun.javaws.exceptions.InvalidArgumentException;

import java.io.*;

public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("C:\\Olympians.lgoo"));
            String check;
            check = input.readLine();
            if(check.equals("LGOO"))
            {
                // this works needs more error checking
                // invalid file type/permission
                input.close();

            }
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found.");
        }
        catch(IOException ioe)
        {
            System.out.println("Problem reading from file");
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
                    System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
                    OlympianManager myOlympianManager = new OlympianManager(); // Instantiating the OlympianManager class
                    System.out.println("This is the listing for each olympian: ");
                    myOlympianManager.setOlympians();
                    Olympian[] myOlympians = myOlympianManager.getOlympians(); // Instantiating an Olympian class so OlympianManager can retrieve
                    displayOlympians(myOlympians);
                }
                else if(inputLine.equals("t")|| inputLine.equals("teams"))
                {
                    System.out.println("\nTEAM LISTINGS\n");
                    TeamManager myTeamManager = new TeamManager();
                    System.out.println("This is the listing for each team: ");
                    myTeamManager.setTeams();
                    Teams[] myTeams = myTeamManager.getTeams();
                    displayTeams(myTeams);

                }
                else if(inputLine.equals("h")|| inputLine.equals("help"))
                {
                    help(); // calls the help method
                }
                else if(inputLine.equals("q") || inputLine.equals("quit"))
                {
                    System.out.println("Have a nice day.");
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
    public static void displayEvents(Event[] myEvents)
    {
        for(int i=0; i < myEvents.length;i++)
        {
            System.out.println("The game: " + myEvents[i].name + " is played to "+ myEvents[i].playTo + " points.");
            System.out.println("It is played at a distance of " + myEvents[i].playDistance + " and holds a boolean value of " + myEvents[i].isPlayToExact);
            System.out.println("Extra info includes: " + myEvents[i].getExtraInfo());
        }
    }
    public static void displayOlympians(Olympian[] myOlympians)
    {
        String[] OlympianNum = new String[16];
        for(int i=0; i < myOlympians.length; i++)
        {
            switch(i)
            {
                case 0:
                    OlympianNum[i] = "First";
                    break;
                case 1:
                    OlympianNum[i] = "Second";
                    break;
                case 2:
                    OlympianNum[i] = "Third";
                    break;
                case 3:
                    OlympianNum[i] = "Fourth";
                    break;
                case 4:
                    OlympianNum[i] = "Fifth";
                    break;
                case 5:
                    OlympianNum[i] = "Sixth";
                    break;
                case 6:
                    OlympianNum[i] = "Seventh";
                    break;
                case 7:
                    OlympianNum[i] = "Eighth";
                    break;
                case 8:
                    OlympianNum[i] = "Ninth";
                    break;
                case 9:
                    OlympianNum[i] = "Tenth";
                    break;
                case 10:
                    OlympianNum[i] = "Eleventh";
                    break;
                case 11:
                    OlympianNum[i] = "Twelfth";
                    break;
                case 12:
                    OlympianNum[i] = "Thirteenth";
                    break;
                case 13:
                    OlympianNum[i] = "Fourteenth";
                    break;
                case 14:
                    OlympianNum[i] = "Fifteenth";
                    break;
                case 15:
                    OlympianNum[i] = "Sixteenth";
                    break;
                default:
                    break;
            }
            System.out.println("The data for the " + OlympianNum[i] + " olympian:");

            System.out.println("Name: " + myOlympians[i].name);
            System.out.println("Sex: " + myOlympians[i].sex);
            System.out.println("Age: " + myOlympians[i].age);
        }
    }
    public static void displayTeams(Teams[] myTeams)
    {
        System.out.println("display teams here");
    }
}


