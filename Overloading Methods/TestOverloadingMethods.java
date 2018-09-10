//Program TestOverloadingMethods, Lab 5
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 22, 2018
//First it is interactive and asks the user how many shirts, pants, and sweaters they want
//This file will take 1, 2, and 3 parameters in calculuateClothesPrice and overload
// We will format the float to two decimal points so that is is accurate
// We use concatenation to make sure everything works together

import java.util.Scanner;

public class TestOverloadingMethods
{
    public static void main(String[] args)
    {

//Instantiates the scanner and asks for userInput
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many shirts are you willing to buy?");
        int integer1 = userInput.nextInt();
        System.out.println("How many pants are you willing to buy?");
        int integer2 = userInput.nextInt();
        System.out.println("How sweaters are you willing to buy");
        int integer3 = userInput.nextInt();
//Instantiates and takes Methods from OverloadingMethods
        OverloadingMethods methodOverload = new OverloadingMethods();
        methodOverload.calculuateClothesPrice(integer1);
        methodOverload.calculuateClothesPrice(integer1,integer2);
        methodOverload.calculuateClothesPrice(integer1,integer2,integer3);
    }
}
