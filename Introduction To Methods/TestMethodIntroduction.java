//Program Test MethodIntroduction, Lab4
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 20, 2018
//This program will import the scanner so that the user can use whatever integers they want.
// We have four methods that we will call that performs arithmetic operations
//These are called by the MethodIntroduction class.
// All of this is called in the main method.

import java.util.Scanner;
public class TestMethodIntroduction
{
    public static void main(String[] args)
    {
//Asks for the userInput by instantiatiating the scanner
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose your first integer");
        int integer1 = userInput.nextInt();
        System.out.println("Choose your second integer");
        int integer2 = userInput.nextInt();

//Instantiates MethodIntroduction and calls method from there
        MethodIntroduction mathOperations = new MethodIntroduction();
        mathOperations.sum(integer1, integer2);
        mathOperations.difference(integer1, integer2);
        mathOperations.product(integer1, integer2);
        mathOperations.quotient(integer1, integer2);
    }
}
