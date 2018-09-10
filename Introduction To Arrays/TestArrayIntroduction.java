//Program TestArrayIntroduction, Lab 9
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//We will initialize the array with int[] myList
//We will instantiate Array introduction to call it from TestArrayIntroduction
//All of the methods have an array arguement passed into it
//Everything is ran under a main function

import java.util.Scanner;

public class TestArrayIntroduction
{
    public static void main(String[] args)
    {
        int[] myList = {6,7,9,2,3,4,28,23,24,33,32,55};
        ArrayIntroduction arrayMethods = new ArrayIntroduction();
        arrayMethods.integerDisplay(myList);
        arrayMethods.reversedInteger(myList);
        arrayMethods.loop(myList);
        arrayMethods.sumAndAverage(myList);
        arrayMethods.greaterThenAverage(myList);
        System.out.println(" ");
    }
}
