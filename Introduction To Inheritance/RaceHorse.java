//Program RaceHorse, Lab 12
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018

//This class will be used in order to get the numberOfRaces
//It helps us find the number of races our horse will run
// The extends keyword allows RaceHorse to inherit from Horse
//Multiple inheritance is not allowed in Java

public class RaceHorse extends Horse
{
    int numberOfRaces;
    public int grabRaces()
    {
        return numberOfRaces;
    }
    public void assignRaces(int race)
    {
        numberOfRaces=race;
    }
    
}


