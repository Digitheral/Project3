package com.company;

/**
 * Created by Art on 11/19/2014.
 */
public class CompetitionManager extends Teams
{
    Competition myCompetition = new Competition();
    CompetitionManager()
    {
        //
    }
    public void StartCompetition(Event event, Teams team1, Teams team2)
    {
       myCompetition.event = event;
       myCompetition.team1 = team1;
       myCompetition.team2 = team2;
    }
    public ICompetition[] GetCompetitions()
    {
      return null;
    }
    public void EndCompetition(Competition competition, Teams winningTeam)
    {

    }
}
