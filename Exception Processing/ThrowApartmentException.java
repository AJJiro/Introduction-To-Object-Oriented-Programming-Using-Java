//Program ThrowApartmentException., Lab 14
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018

//This class is used in ourder to try and catch all the exceptions with the four indicies
//We create four indices for the 6 different apartments we made up
//Each try and except block will check if we are able to go through with creating our apartment
//If not we will have to go all the way to the botttom in order to see the loop


public class ThrowApartmentException
{
   public static void main(String[] args)
    {
       Apartment apartment[] = new Apartment[6];
       System.out.println("These apartments are being made: ");
       try
       {   System.out.println("");
           apartment[0] = new Apartment("Santo Tomas", 12, 3, 5000);
           System.out.println("This apartment will be coming soon.");
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       try
       {
           apartment[1] = new Apartment("My Crib", 456, 3, 1800);
           System.out.println("This apartment will be coming soon.");
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       try
       {
           apartment[2] = new Apartment("Overlooking The Bay", 1000, 3, 2000);
           System.out.println("This apartment will be coming soon.");
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       try
       {
           apartment[3] = new Apartment("Mike's Auto Repair Shop", 626, 3, 50);
           System.out.println("This apartment will be coming soon.");
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       try
       {
           apartment[4] = new Apartment("Big Baller Brand", 289, 3, 2349);
           System.out.println("This apartment will be coming soon.");
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       try
       {
           System.out.println("This apartment will be coming soon.");
           apartment[5] = new Apartment("Grand Goldie Canyon", 329, 4, 1798);
       }
       catch(ApartmentExeception EZ)
       {
           System.out.println(EZ.printPrompt());
       }

       System.out.println("");
       System.out.println("These are the apartments that are being built:");
       System.out.println("");

//This loop will go through all the indices to check if it works
//We do this by going through each index and checking if it is null
//null checks if there is memory for that specific index. This is because null has no memeory
// If it is null and has  no memory because it goes out of our restrictions then it doesn't meet our requirements
//else it means that we can have the apartment
       for(int i=0; i<6; i++)
       {
           if(apartment[i] == null)
           {
               System.out.println("Apartment does not meet the satisfied requirements.");
               System.out.println("");
           }
           else
           {
               System.out.println(apartment[i]);
               System.out.println("");
           }
       }
   }
}
