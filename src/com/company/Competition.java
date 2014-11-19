package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class Competition implements ICompetition
{
    // This class will implement the linked list logic

    // Information in linked list
    Event event;
    Teams team1;
    Teams team2;

    Competition nextComp; // next pointer
    Competition prevComp; // previous pointer
}
