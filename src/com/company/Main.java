// Program: Project II - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1

// All methods are invoked, you can end the program via the HELP menu 'h' -> '0'
// Methods re-invoke to prevent pre-mature end of program

package com.company;

public class Main
{
    public static String ExtraInfo;
    public enum Sex
    {
        MALE,
        FEMALE;
    }

    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");

        // Comparing for error-checking this way we don't crash
        if(args.equals("e") || args.equals("events"))
        {
            EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
            myEventManager.getEvents();
            myEventManager.getInfo();
        }
        else if(args.equals("o") || args.equals("olympians"))
        {
            OlympianManager myOlympianManager;
        }
        else if(args.equals("h") || args.equals("help"))
        {
            help(); // method call to help
        }
        else
        {
            System.out.println("Error: Not a command. Please refer to help menu by typing 'h' or 'help'.");
        }
    }
    public static void help()
    {
        System.out.println("Welcome to the Help menu.");
        System.out.println("On the splash screen input 'e' or 'events' to view today's events.");
        System.out.println("Input 'o' or 'olympians' to view the status of all olympians.");
        System.out.println("You figured out how to get here by typing 'h' or 'help'.");
    }
}