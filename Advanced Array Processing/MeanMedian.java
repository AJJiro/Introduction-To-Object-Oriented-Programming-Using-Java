//Program MeanMedian, Lab 10
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//This class has three methods with two of them passing in an array.
//The third method will pass in the array and size
// Each of the methods use for loops to traverse across the array.
//These will be called in MeanMedian2
import java.util.Scanner;

public class MeanMedian
{
   Scanner userInput = new Scanner(System.in);

   public void inputArray(int [] myArray)
   {
       for  (int i = 0; i < myArray.length; i++)
           myArray[i] = userInput.nextInt();
   }

   public void insertionSort(int [] myArray)
  {
           int i;
           for (i = 0; i < myArray.length - 1; ++i)
               for (int j =+ i ; j < myArray.length; ++j)
           {
               if (myArray[i] > myArray[j])
               {
                   int temp = myArray[i];
                   myArray[i] = myArray[j];
                   myArray[j] = temp;
               }
           }
   }

   public void calculateMeanAndfindAverage(int [] myArray,int size)
   {
       double mean;
       double median;
       double sum = 0;
       for (int i = 0; i < myArray.length; i++)
       {
           sum += myArray[i];
       }
       mean = sum / myArray.length;
       if(size%2==0)
           median = (myArray[(size-1)/2] + myArray[(size)/2])/2;
       else
           median = myArray[size/2];
       System.out.println("The mean is " + mean);
       System.out.println("The median is " + median);
   }

}
