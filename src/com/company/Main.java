// Program: Project III - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development
package com.company;


import java.io.*;

public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        try
        {
            InputStream input = new FileInputStream("C:\\Olympians.lgoo");
            byte[] buffer = new byte[1024];
            int numBytesRead;

            while ((numBytesRead = input.read(buffer)) > 0) {
                System.out.println("Length: " + numBytesRead);
                for (int i = 0; i < numBytesRead; i++)
                    System.out.println("Byte: " + buffer[i]);
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
        if(args.length == 0)
        {
            System.out.println("There are no arguments, please input one.");
        }
        else if (args[0].equals("e") || args[0].equals("events"))
        {
            System.out.println("\nEVENT LISTING AND DESCRIPTION.\n");
            EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
            System.out.println("This is the listing and description of each event: ");
            myEventManager.setEvents();
            Event[] myEvents = myEventManager.getEvents();
            displayEvents(myEvents);
        }
        else if (args[0].equals("o") || args[0].equals("olympians"))
        {
            System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
            OlympianManager myOlympianManager = new OlympianManager(); // Instantiating the OlympianManager class
            System.out.println("This is the listing for each olympian: ");
            myOlympianManager.setOlympians();
            Olympian[] myOlympians = myOlympianManager.getOlympians(); // Instantiating an Olympian class so OlympianManager can retrieve
            displayOlympians(myOlympians);

        }
        else if (args[0].equals("h") || args[0].equals("help"))
        {
            help(); // method call to help
        }
        else if (args[0].equals("t") || args[0].equals("team"))
        {
            System.out.println("\nTEAM LISTINGS\n");
            TeamManager myTeamManager = new TeamManager();
            System.out.println("This is the listing for each team: ");
            myTeamManager.setTeams();
            Teams[] myTeams = myTeamManager.getTeams();
            displayTeams(myTeams);

        }
        else if (args[0].equals("h") || args[0].equals("help"))
        {
            help(); // method call to help
        }
        else if(args[0].equals("q") || args[0].equals("quit"))
        {
            System.exit(0);
        }
        else
        {
            // Error catching
            System.out.println("Error: Not a command. Please refer to help menu by typing 'h' or 'help'.");
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


