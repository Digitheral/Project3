package com.company;

// Base class that is called from main for Events
public class EventManager
{
  // Information for Events
  private static Event[] myEvent = new Event[6];
  private static WashoosEvent myWashoos = new WashoosEvent();
  private static CanJamEvent myCanJam = new CanJamEvent();
  private static HorseshoesEvent myHorseshoes = new HorseshoesEvent();
  private static CornHoleEvent myCornhole = new CornHoleEvent();
  private static LadderBallEvent myLadderBall = new LadderBallEvent();
  private static StickgameEvent myStickgame = new StickgameEvent();

    // Constructor for Class EventManager
    public EventManager()
    {
        myEvent[0] = myWashoos;
        myEvent[1] = myCanJam;
        myEvent[2] = myHorseshoes;
        myEvent[3] = myCornhole;
        myEvent[4] = myLadderBall;
        myEvent[5] = myStickgame;
    }
    public void setEvents()
    {
        for(int i=0; i<myEvent.length; i++)
        {
            switch(i)
            {
                case 0:
                    myEvent[i].name = "Washoos";
                    myEvent[i].playTo = 21;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 13;
                    myWashoos.setExtraWashoos();
                    myEvent[i].getExtraInfo();
                    break;
                case 1:
                    myEvent[i].name = "Canjam";
                    myEvent[i].playTo = 21;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 5;
                    myCanJam.setFrisbeeSize();
                    myEvent[i].getExtraInfo();
                    break;
                case 2:
                    myEvent[i].name = "Horseshoes";
                    myEvent[i].playTo = 12;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 15;
                    myHorseshoes.setNumHorseShoes();
                    myEvent[i].getExtraInfo();
                    break;
                case 3:
                    myEvent[i].name = "Cornhole";
                    myEvent[i].playTo = 21;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 13;
                    myCornhole.setNumBeanBags();
                    myEvent[i].getExtraInfo();
                    break;
                case 4:
                    myEvent[i].name = "Ladderball";
                    myEvent[i].playTo = 21;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 13;
                    myLadderBall.setNumRungs();
                    myEvent[i].getExtraInfo();
                    break;
                case 5:
                    myEvent[i].name = "Stickgame";
                    myEvent[i].playTo = 12;
                    myEvent[i].isPlayToExact = false;
                    myEvent[i].playDistance = 14;
                    myStickgame.setFrisbeeSize();
                    myEvent[i].getExtraInfo();
                    break;
                default:
                    break;

            }
        }

    }
    public Event[] getEvents()
    {
        return myEvent;
    }

}