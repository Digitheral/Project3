package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public interface ICompetition
{
    // This is the interface that Competition is implementing
    Event event = new Event() {
        @Override
        public String getExtraInfo() {
            return null;
        }
    };
    Teams team1 = new Teams();
    Teams team2 = new Teams();
   // public ICompetition[] listToArray(Competition myComps);
}
