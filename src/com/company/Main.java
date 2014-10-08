// Program: Project I - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1

// All methods are invoked, you can end the program via the HELP menu 'h' -> '0'
// Methods re-invoke to prevent pre-mature end of program

package com.company;
import java.util.Scanner;

public class Main
{
    public static String[] EventName; // This array holds each game name for descriptions later.
    public static String[][] OlympianData; // This array holds the name, sex and age of each olympian as well as how to address them.

    public enum Sex
    {
        MALE,
        FEMALE;
    }

    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        splashscreen(); // Call to splash screen function that way we can cycle through this program
    }
    public static void splashscreen()
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");
        // Initializes input
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please input a command: ");
        // Accepts user input and makes decisions
        String inString = userIn.next();

        // Comparing for error-checking this way we don't crash
        if(inString.equals("e") || inString.equals("events"))
        {
            EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
            myEventManager.getEvents();
            myEventManager.getInfo();
            System.out.println(myEventManager);

         //   events(); // method call to event listing
        }
        else if(inString.equals("o") || inString.equals("olympians"))
        {
            OlympianManager myOlympianManager;
            olympians(); // method call to olympians
        }
        else if(inString.equals("h") || inString.equals("help"))
        {
            help(); // method call to help
        }
        else
        {
            System.out.println("Error: Not a command. Please refer to help menu by typing 'h' or 'help'.");
            splashscreen();
        }
    }

    // Event methods
    public static void events()
    {
        initEvents();
        System.out.println("Today's events include:");
        // this loop will iterate through the array so we can display each of today's games
        for(int i=0;i<6;i++)
        {
            System.out.print(EventName[i] + "\n");
        }
        System.out.println("Input Anything To Return to Main Menu...");

        // This scanner is here so we can go back to the splash screen
        new java.util.Scanner(System.in).nextLine();
        splashscreen();
    }
    // We initialize the Events here to the String EventName so it is more local
    public static void initEvents()
    {
        String Game[] = {"Washoos", "Canjam", "Horseshoes","Cornhole","Ladderball", "Stickgame"};
        EventName = Game;
    }

    // Olympian methods
    public static void olympians()
    {
        initOlympians();
        System.out.println("Today's Olympians are: ");
        // this loop will iterate through the array so we can display each olympian and the data about them
        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(OlympianData[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("Input Anything To Return to Main Menu...");

        // This scanner is here so we can go back to the splash screen
        new java.util.Scanner(System.in).nextLine();
        splashscreen();
    }
    // We initialize the Olympians here for the same reasons we initialized the Events
    public static void initOlympians()
    {
        String Olympians[][] = {{"Mr. ", "Brian Smith, Male, 31"}, {"Ms. ", "Carol Smith, Female, 30"}, {"Mr. ", "Kevin Smith, Male, 22"}, {"Mrs. ", "Judy Smith, Female, 15"},
                                {"Dr. ", "Darren Smith, Male, 44"}, {"Ms. ", "Eileen Smith, Female, 78"}, {"Mr. ", "Greg Smith, Male, 17"}, {"Mr. ", "Billy Smith, Male, 23"},
                                {"Mrs. ", "Deborah Smith, Female, 20"}, {"Mr. ", "Darren Smith Jr., Male, 12"}, {"Mrs. ", "Sarah Smith, Female, 25"}, {"Ms. ", "Natasha Smith, Female, 7"},
                                {"Mr. ", "Bob Smith, Male, 33"}, {"Mr. ", "Joseph Smith, Male, 59"}, {"Mr. ", "Nick Smith, Male, 12"}};
        OlympianData = Olympians;
    }

    // Help menu method
    public static void help()
    {
        System.out.println("Welcome to the Help menu.");
        System.out.println("Input any command to return to Splash Screen. 0 to end program.");
        System.out.println("On the splash screen input 'e' or 'events' to view today's events.");
        System.out.println("Input 'o' or 'olympians' to view the status of all olympians.");
        System.out.println("You figured out how to get here by typing 'h' or 'help'.");

        // This scanner allows for the input of the help menu
        Scanner userIn = new Scanner(System.in);
        String helpExit = userIn.next();

        // This condition ends this program if 0 is input
        if (helpExit.equals("0"))
        {
            System.exit(0);
        }
        // If condition fails, return to splash screen
        splashscreen();
    }
}