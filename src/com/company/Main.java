/******************************************
 Program: Project IV - Lawn Olympic Games
 Arthur Pearson
 CMPT 220 - Fall 2014 Software Development
 The file is read from the root directory of the C:/ make sure you either place your .lgoo file there or change the path.
 Every exception in this program will invoke a system.exit() command and notify of the issue and notify that the
 program is ending
 The linked list seems to be working but I can't get the interface working.
 ******************************************/
package com.company;

import java.io.*;
import java.lang.String;

// Start, View, End Competition needs Linked List
public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args) throws InvalidFormatException, IOException, NullPointerException
    {
        int fileLength = 0; // To count the number of olympians in the file, this will be used for the constructor
        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        try
        {
            // This begins the file type checking
            String check;
            check = input.readLine();
            try
            {
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
            }
            catch(NullPointerException npe)
            {
                System.out.println("Problem reading from file. Check to see the data is correct.");
                System.out.println("Ending Program.");
                System.exit(0);
            }
        }
        catch(InvalidFormatException ife)
        {
            System.out.println("File is an invalid format.");
            System.out.println("Ending Program.");
            System.exit(0);
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("File not found, please check that the file exists or that your are permitted to view the file.");
            System.out.println("Ending Program.");
            System.exit(0);
        }
        catch(IOException ioe)
        {
            System.out.println("Problem reading from file");
            System.out.println("Ending Program.");
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
            String inputLine = " ";
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader consoleInput = new BufferedReader(isr);

            // Object instatiations

            EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
            Event[] myEvents = myEventManager.getEvents(); // Instantiating an event object so EventManager can retrieve
            myEventManager.setEvents();

            OlympianManager myOlympianManager = new OlympianManager(fileLength); // Instantiating the OlympianManager class
            myOlympianManager.setOlympians(fileLength, args[0]);
            Olympian[] myOlympians = myOlympianManager.getOlympians(); // Instantiating an Olympian class so OlympianManager can retrieve

            TeamManager myTeamManager = new TeamManager(myOlympians, fileLength);
            myTeamManager.setTeams(myOlympians, fileLength);
            Teams[] myTeams = myTeamManager.getTeams();

            CompetitionManager myCompManager = new CompetitionManager();

            while (consoleInput != null)
            {
                ICompetition[] myComps = myCompManager.getCompetitions();
                System.out.println("\nPlease input an argument: ");
                inputLine = consoleInput.readLine();
                if (inputLine.equals("e") || inputLine.equals("events"))

                {
                    System.out.println("\nEVENT LISTING AND DESCRIPTION.\n");
                    System.out.println("This is the listing and description of each event: ");
                    displayEvents(myEvents);
                }
                else if (inputLine.equals("o") || inputLine.equals("olympians"))
                {
                    // We pass fileLength around here to make sure the Olympians array is the right length
                    System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
                    System.out.println("This is the listing for each olympian: ");
                    displayOlympians(myOlympians, fileLength);
                }
                else if (inputLine.equals("t") || inputLine.equals("teams"))
                {
                    System.out.println("\nTEAM LISTINGS\n");
                    System.out.println("This is the listing for each team: ");
                    displayTeams(myTeams, fileLength);
                }
                else if (inputLine.equals("c") || inputLine.equals("competitions"))
                {
                    System.out.println("\nCOMPETITION LISTINGS\n");
                    System.out.println("This is the listing for each competition: ");
                    displayComps(myComps);
                }
                else if (inputLine.equals("sc") || inputLine.equals("startcompetition"))
                {
                    int x = myTeams.length + 1;
                    int y = myTeams.length + 1;
                    int z = myEvents.length + 1;
                    while(x > myTeams.length)
                    {
                        System.out.println("Select the first team number you wish to put in a competition");
                        inputLine = consoleInput.readLine();
                        x = Integer.parseInt(inputLine);
                        if(x > myTeams.length)
                        {
                            System.out.println("Invalid team number");
                        }
                    }
                    while(y > myTeams.length)
                    {
                        System.out.println("Select the second team number you wish to put in a competition");
                        inputLine = consoleInput.readLine();
                        y = Integer.parseInt(inputLine);
                        if(x > myTeams.length)
                        {
                            System.out.println("Invalid team number");
                        }
                    }
                    while(z > myEvents.length)
                    {
                        System.out.println("Select the event number you wish to put in a competition");
                        inputLine = consoleInput.readLine();
                        z = Integer.parseInt(inputLine);
                        if(x > myEvents.length)
                        {
                            System.out.println("Invalid event number");
                        }
                    }

                    myCompManager.StartCompetition(myEvents[z], myTeams[x], myTeams[y]);
                }
                else if (inputLine.equals("ec") || inputLine.equals("endcompetition"))
                {
                    System.out.println("Select the competition to end");
                    inputLine = consoleInput.readLine();
                    int x = Integer.parseInt(inputLine);
                    System.out.println("Which team won the competition?");
                    inputLine = consoleInput.readLine();
                    int y = Integer.parseInt(inputLine);
                    myCompManager.EndCompetition(myComps[x], myTeams[y]);
                }
                else if (inputLine.equals("h") || inputLine.equals("help"))
                {
                    help(); // calls the help method
                }
                else if (inputLine.equals("q") || inputLine.equals("quit"))
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
        // Catches input that the program wouldn't understand normally, just in case it can't handle something
        // though the if structure should handle most of this
        catch (IOException ioe)
        {
            System.out.println("Input error");
            System.out.println("Ending Program.");
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
    public static void displayComps(ICompetition[] myComps)
    {
        for(int i=0; i< myComps.length; i++)
        {
            System.out.println("Competition number " + i);
            System.out.println(myComps);
        }
    }
}


