// Program: Project II - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1

// All methods are invoked, you can end the program via the HELP menu 'h' -> '0'
// Methods re-invoke to prevent pre-mature end of program

package com.company;

public class Main
{
    public static String ExtraInfo;
    public static String BasicInfo;

    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");
        /* This for iterates through each of the arguments provided by the console so we can determine what class to callu
        upon. We can go to the EventManager or OlympianManager class and access each of those classes subclasses
        Help menu will print without a class, but a method call. */
        for(int i=0; i < args.length; i++)
        {
            if (args[i].equals("e") || args[i].equals("events"))
            {
                System.out.println("\nEVENT LISTING AND DESCRIPTION.\n");
                EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
                myEventManager.getEvents();
                System.out.println("This is the listing and description of each event: ");
                myEventManager.getInfo(); // Getting all the information displayed
            }
            else if (args[i].equals("o") || args[i].equals("olympians"))
            {
                System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
                OlympianManager myOlympianManager = new OlympianManager(); // Instantiating the OlympianManager class
                myOlympianManager.getOlympians();
                System.out.println("This is the listing for each olympian: ");
                myOlympianManager.getInfo();
            }
            else if (args[i].equals("h") || args[i].equals("help")) {
                help(); // method call to help
            }
            else
            {
                System.out.println("Error: Not a command. Please refer to help menu by typing 'h' or 'help'.");
            }
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
}