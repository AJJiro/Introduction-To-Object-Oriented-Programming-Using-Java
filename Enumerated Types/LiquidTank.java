//Program LiquidTank, Lab 11
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//This class will only have one switch method that would be used in TestLiquidTank
// We will compare the user's action with the strings
// Everything will be upper case so that the user will be able to type lower or upper case
//else the program will loop back to the start.
import java.util.Scanner;

public class LiquidTank
{
    Scanner userInput = new Scanner(System.in);
   public void makingDecisions(String input)
   {
       switch (input)
       {
       case "EMPTY":
            System.out.println("The current level is empty");
            System.exit(0);
            break;
       case "LOW":
            System.out.println("The current level is low");
            System.exit(0);
            break;
       case"MID":
           System.out.println("The current level is medium");
           System.exit(0);
           break;
       case"HIGH":
           System.out.println("The current level is high");
           System.exit(0);
           break;
       default:
            System.out.println("Please try again");
            input = userInput.nextLine().toUpperCase();
            makingDecisions(input);
      }
   }
}
