//Program TestStringReversal, Lab 8
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 9, 2018
//Instantiates to call from the StringReversal class
//The program will initialize and integer so the while keep can keep going
// Our program instantiates the Scanner in order to get userInput
// We use nested loops to keep making decisions.

import java.util.Scanner;

public class TestStringReversal
{
    public static void main(String[] args)
    {
        StringReversal workingWithStrings = new StringReversal();
        int i = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Make sure to type your last name then first name after (last, first).");
        String name = userInput.nextLine();
        while(i <= 0)
        {
        if(workingWithStrings.checkNumber(name))
          System.exit(0);
        if (name.contains(","))
        {
         System.out.println("Your name is " + name);
         System.out.println("Your name in reverse is "  + new StringBuilder(name).reverse().toString());
         workingWithStrings.remember();
         name = userInput.nextLine();
         }
         if (workingWithStrings.checkNumber(name))
          System.exit(0);
        else
          {
          System.out.println("Your name is " + name);
          System.out.println("Your name in reverse is "  + new StringBuilder(name).reverse().toString());
          workingWithStrings.exitOut();
          name = userInput.nextLine();
          }
       }
    }
}
