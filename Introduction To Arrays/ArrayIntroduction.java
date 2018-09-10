//Program ArrayIntroduction, Lab 9
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 9, 2018
//This class is used to make methods that will be called in TestArrayIntroduction.java
//We will make 5 methods and they will use for loops to parse thrugh the array.
// We will pass one list parameter in the methods
//We will call everything else in the main method of TestArrayIntroduction2

public class ArrayIntroduction
{

    public void integerDisplay(int [] itemList)
    {
       int i;
       System.out.print("The integers are ");
       for (i = 0;  i < 12;  ++i)
           System.out.print(" "+itemList[i]);
    }

    public void reversedInteger(int [] itemList)
    {
        int i;
        System.out.println(" ");
        System.out.print("The reversed integers are ");
        for (i = 11;  i >=0;  --i)
            System.out.print(" "+itemList[i]);
    }

    public void loop(int [] itemList)
    {
        int i;
        System.out.println(" ");
        System.out.print("The elements with odd indexes are the integers ");
        for (i = 0;  i <12;  i+=2)
            System.out.print(" "+itemList[i]);
    }

    public void sumAndAverage(int [] itemList)
    {
        int i;
        double total = 0;
        double average;
        System.out.println(" ");
        for (i = 0;  i <12;  ++i)
            total+=itemList[i];
            average = total/12;
            System.out.println("The sum is " + total);
            String.format("%,.2f", average);
            System.out.println("The average is " + average);
    }

    public void greaterThenAverage(int [] itemList)
    {
        int i;
        System.out.print("These integers are greater then the average ");
        for (i = 0;  i < 12;  ++i)
            if (itemList [i] > 18.83332)
                System.out.print(" "+itemList[i]);
    }
}
