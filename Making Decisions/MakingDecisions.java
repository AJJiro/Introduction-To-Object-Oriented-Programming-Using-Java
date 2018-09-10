//Program MakingDecisions, Lab 6
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 22, 2018
//This file will take 1, 2, and 3 constant parameters in calculuateClothesPrice
// We will call it again in the main function so that it will give us the prices of each
import java.util.Scanner;

public class MakingDecisions
{
    public double calculuateCompactCarPrice(int shirts)
    {
        double cost;
        cost = 160.00;
        System.out.print("The price of the car is $");
        System.out.format("%.2f", cost);
        System.out.println(" per week.");
        return cost;
    }
    public double calculuateMidAndFullSizePrice(int mid)
    {
        double cost = 175.00;
        System.out.print("The price of the car is $");
        System.out.format("%.2f", cost);
        System.out.println(" per week.");
        return cost;
    }
    public double calculuateSuvPrice(int suv)
    {
        double cost = 200.00;
        System.out.print("The price of the SUV is $");
        System.out.format("%.2f", cost);
        System.out.println(" per week.");
        return cost;
    }
    public void runWholeProgram()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which car rental are you willing to buy? You can choose");
        System.out.println("1 for full-size, 2 for mid-size, 3 for compact, or 4 for SUV.");
        int integer1 = userInput.nextInt();
        if (integer1==1)
            {
            Scanner anotherUserInput = new Scanner(System.in);
            calculuateCompactCarPrice(integer1);
            System.out.println("Would you like to add the premium sound package for $30?");
            System.out.println("Type 0 if you want to add the premium sound package.");
            int choice = anotherUserInput.nextInt();
            if (choice == 0)
                System.out.println("The price of the car is now $190.00 per week.");
            else
                System.out.println("The price of the car is still $160.00 per week.");
            }
        else if (integer1==2 || integer1==3)
            {
            Scanner anotherUserInputTwo = new Scanner(System.in);
            calculuateMidAndFullSizePrice(integer1);
            System.out.println("Would you like to add the premium sound package for $30?");
            System.out.println("Type in 0 if you would like to add it.");
            int  secondChoice = anotherUserInputTwo.nextInt();
            if (secondChoice == 0)
                    System.out.println("The price of the car is now $205.00 per week");
            else
                System.out.println("The price of the car is still $175.00 per week.");
            }
        else if (integer1==4)
            {
            Scanner anotherUserInputThree = new Scanner(System.in);
            calculuateSuvPrice(integer1);
            System.out.println("Would you like to add the premium sound package for $30?");
            System.out.println("Type in 0 if you would like to add it.");
            int thirdChoice = anotherUserInputThree.nextInt();
            if (thirdChoice == 0)
                    System.out.println("The price of the car is now $230.00 per week");
            else
                System.out.println("The price of the car is still $160.00 per week.");
            }
        else
            System.out.print("The price of the car is $0.00.");
    }

}
