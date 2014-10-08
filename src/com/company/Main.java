// Program: Project II - Lawn Olympic Games
// Arthur Pearson
// CMPT 220 - Fall 2014 Software Development 1
// Commments: I'm not quite sure I did the Abstract implementation how you wanted it, I displayed it referencing Event from EventManager as opposed to from Main.
//            Haven't worked with abstract classes much.

package com.company;

public class Main
{
    // Main Method for Splash Screen
    public static void main(String[] args)
    {
        // Prints Splash Screen
        System.out.println("Smith Family Lawn Olympic Games");

        /* This for iterates through each of the arguments provided by the console so we can determine what class to call
        upon. We can go to the EventManager or OlympianManager class and access each of those classes subclasses
        Help menu will print without a class, but a method call. */

        for(int i=0; i < args.length; i++)
        {
            if (args[i].equals("e") || args[i].equals("events"))
            {
                System.out.println("\nEVENT LISTING AND DESCRIPTION.\n");
                EventManager myEventManager = new EventManager(); // Instantiating the EventManager class
                System.out.println("This is the listing and description of each event: ");
                myEventManager.getInfo(); // Displays the abstract class Events also displays ExtraInfo
                                          // Due to abstraction, the class "Events" cannot be initalized
                                          // We will print out the games within the EventManager class, retrieved from the subclasses.
            }
            else if (args[i].equals("o") || args[i].equals("olympians"))
            {
                System.out.println("\nOLYMPIAN LISTING AND INFORMATION.\n");
                OlympianManager myOlympianManager = new OlympianManager(); // Instantiating the OlympianManager class
                Olympian myOlympian = myOlympianManager.getOlympians(); // Instantiating an Olympian class so
                                                                        // OlympianManager can retrieve
                System.out.println("This is the listing for each olympian: ");
                olympianDisplay(myOlympian); // Call to display Olympians

            }
            else if (args[i].equals("h") || args[i].equals("help"))
            {
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
    // This method display Olympian Data
    public static void olympianDisplay(Olympian myOlympian)
    {
        {
            String Sex[] = new String[myOlympian.name.length];
            String OlympianNumber[] = new String[myOlympian.name.length];
            // Iterating through every event to get the information that was stored in the constructor
            for (int i = 0; i < myOlympian.name.length; i++)
            {
                // This switch statement sets the participant number
                switch (i)
                {
                    case 0:
                        OlympianNumber[i] = "First";
                        break;
                    case 1:
                        OlympianNumber[i] = "Second";
                        break;
                    case 2:
                        OlympianNumber[i] = "Third";
                        break;
                    case 3:
                        OlympianNumber[i] = "Fourth";
                        break;
                    case 4:
                        OlympianNumber[i] = "Fifth";
                        break;
                    case 5:
                        OlympianNumber[i] = "Sixth";
                        break;
                    case 6:
                        OlympianNumber[i] = "Seventh";
                        break;
                    case 7:
                        OlympianNumber[i] = "Eighth";
                        break;
                    case 8:
                        OlympianNumber[i] = "Ninth";
                        break;
                    case 9:
                        OlympianNumber[i] = "Tenth";
                        break;
                    case 10:
                        OlympianNumber[i] = "Eleventh";
                        break;
                    case 11:
                        OlympianNumber[i] = "Twelfth";
                        break;
                    case 12:
                        OlympianNumber[i] = "Thirteenth";
                        break;
                    case 13:
                        OlympianNumber[i] = "Fourteenth";
                        break;
                    case 14:
                        OlympianNumber[i] = "Fifteenth";
                        break;
                    default:
                        break;
                }
                // This switch determines the sex from the Enumeration
                switch (myOlympian.sex[i])
                {
                    case MALE:
                        Sex[i] = "Male";
                        break;
                    case FEMALE:
                        Sex[i] = "Female";
                        break;
                    default:
                        break;
                }
                System.out.println("The " + OlympianNumber[i] + " olympian's name is " + myOlympian.name[i] + ".");
                System.out.println("They are " + Sex[i] + " and " + myOlympian.age[i] + " years old.");
                // This takes us to get extra info about the games so we can print it below

            }

        }
    }
}
