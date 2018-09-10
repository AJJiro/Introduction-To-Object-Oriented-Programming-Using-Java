//Program DemoHorse, Lab 12
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018

//This is an application that demonstrates using objects of each class
//We start by calling constructors during inheritance
// We instantiate the scanner and use it to get the user's input on their horse
//We end the program by saving the characteristics below

import java.util.Scanner;
public class DemoHorse
{
    public static void main(String [] args)
    {
        RaceHorse attributes = new RaceHorse();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type in the name of your horse: ");
        String name = userInput.nextLine();
        System.out.println("Type in the color of the horse: ");
        String color = userInput.nextLine();
        System.out.println("Type in the year your horse was born: ");
        int birthYear = userInput.nextInt();
        System.out.println("Type in the number of races ran by the horse : ");
        int racesRan = userInput.nextInt();
        
        attributes.assignName(name);
        attributes.assignColor(color);
        attributes.assignYear(birthYear);
        attributes.assignRaces(racesRan);
        
        System.out.println("");
        System.out.println("Your horse's characteristics have been saved below.");
        System.out.println("Name --> " + attributes.grabName());
        System.out.println("Color --> " + attributes.grabColor());
        System.out.println("Year --> " + attributes.grabYear());
        System.out.println("Races ran by the horse --> " + attributes.grabRaces());
    }
    
}


