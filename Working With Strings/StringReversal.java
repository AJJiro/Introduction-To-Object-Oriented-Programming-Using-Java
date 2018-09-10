//Program StringWork, Lab 8
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 9, 2018
//This file will create boolean methods so that we can keep looping
// Checks each index to see if there are any commas and alerts the user
// Checks to see if it is a digit so that the program can exit out
//Uses char to chekc each individual index of the string
import java.util.Scanner;

public class StringReversal
{
       public static boolean checkNumber(String statements)
       {
            for(int i=0; i<statements.length() ; ++i) //here
            {
                 char c = statements.charAt(i);
                 if (Character.isDigit(c))
                      return true;
           }
            return false;
       }
       public void remember()
        {
            System.out.println("Make sure to type your last name then first name after (last, first).");
            System.out.println("Or exit with a number.");
        }
       public void exitOut()
        {
            System.out.println("Make sure to type your last name then first name after (last, first).");
            System.out.println("Or exit with a number.");
        }
}
