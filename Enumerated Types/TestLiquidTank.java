//Program TestLiquidTank, Lab 11
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//We will use instantiation to bring the method from Liquid Tank
// We will create the enum data type in order to create the various storage inside the tank
// We will get the userInput so that we know what is in the user's tank
// We will loop it until we get an answer that we want.
import java.util.Scanner;

public class TestLiquidTank
{
   enum tankLevel{EMPTY,LOW,MID,HIGH};
   public static void main(String[] args)
   {
       LiquidTank currentCapacity = new LiquidTank();
       String input;
       Scanner userInput = new Scanner(System.in);
       int i =0;
       for (tankLevel currentLevel : tankLevel.values())
 			System.out.print(currentLevel + ", ");
       System.out.println("\nWhat is your current tank level?");
  		input = userInput.nextLine().toUpperCase();
        while(i==0)
        currentCapacity.makingDecisions(input);
   }
}
