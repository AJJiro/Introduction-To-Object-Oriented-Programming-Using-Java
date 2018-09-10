//Program Basic Math, Lab3
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 18, 2018
// This program will start off by initializing three variables
//We will cast amountOrdered,numberOfBoxes, and leftOverBooks as an integer
//We will use scanner to make our program be interactive
// We divide amountOrdered by 15 to see how many boxes we need.
//We use the modulus in order to find out how the reaminder of leftOverBooks

import java.util.Scanner;
public class BasicMath
{
    public static void main(String[] args)
    {
        int amountOrdered;
        int numberOfBoxes;
        int leftOverBooks;

        Scanner userInput = new Scanner(System.in);
        System.out.print ("How much items did you order?");
        amountOrdered= userInput.nextInt();
        numberOfBoxes=  amountOrdered/15;
        leftOverBooks= amountOrdered%15;
        System.out.print ("We have ");
        System.out.println(numberOfBoxes+" boxes left over.");
        System.out.println("While there are" +' ' +leftOverBooks + ' '+ "left over books ");
    }
}
