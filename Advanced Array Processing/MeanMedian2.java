//Program MeanMedian2, Lab 10
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//This class will have a main function which calls from MeanMedian
// We will instantiate the scanner and make the MeanMedian class usable for MeanMedian2
//We will use while loops in order to prompt the user to choose a size less than 20
// If they chose a size less than 20 we will bring the other methods too MeanMedian2

import java.util.Scanner;

public class MeanMedian2
{

   public static void main(String[] args)
   {
       int i =0;
       Scanner userInput = new Scanner(System.in);
       MeanMedian meanAndMedian = new MeanMedian();
       System.out.println("Enter list the capacity of your list.");
       int capacity = userInput.nextInt();
       while(i<=0)
       {
       if(capacity>20)
          {
           System.out.println("Please enter a capacity that is only less than 20.");
           capacity = userInput.nextInt();
           }
       else
       {
           System.out.println("Enter as much integers as " + capacity);
           int myArray[] = new int[capacity];
           meanAndMedian.insertionSort(myArray);
           meanAndMedian.inputArray(myArray);
           meanAndMedian.calculateMeanAndfindAverage(myArray,capacity);
           System.exit(0);
       }

       }
   }
}
