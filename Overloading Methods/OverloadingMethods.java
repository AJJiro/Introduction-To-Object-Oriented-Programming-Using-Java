//Program OverloadingMethods, Lab 5
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 22, 2018
//This file will take 1, 2, and 3 constant parameters in calculuateClothesPrice
// We will call it again in the main function so that it will give us the prices of each
public class OverloadingMethods
{

//Will pass in one arguement for calculuateClothesPrice
    public static double calculuateClothesPrice(int shirts)
    {
        double cost;
        cost = (75*shirts);
        System.out.print("The price of the shirts is ");
        System.out.format("%.2f", cost);
        System.out.println(".");
        return cost;
    }

//Will pass in two arguements for calculuateClothesPrice
    public static double calculuateClothesPrice(int shirts, int pants)
    {
        double cost =(75* shirts) +  (50*pants);
        System.out.print("The price of the shirts and pants is ");
        System.out.format("%.2f", cost);
        System.out.println(".");
        return cost;
    }

// Will pass in three arguements for calculate ClothesPrice
    public static double calculuateClothesPrice(int shirts, int pants, int sweaters)
    {
        double cost = (75* shirts)+ (50* pants) + (100* sweaters);
        System.out.print("The price of the shirts, pants, and sweaters is ");
        System.out.format("%.2f", cost);
        System.out.println(".");
        return cost;
    }

}
