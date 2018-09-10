//Program MethodIntroduction, Lab4
//Written By: Arman Joachim Chin Jiro Jr.
//Created on June 20, 2018
//This program will have predetermined integers.
// We have four methods that we will call that performs arithmetic operations.
// All of this is called in the main method.
// We will transfer this to TestMethodIntroduction.java


public class MethodIntroduction
{
    
//Our methods use concatenation to put the strings together
    public void sum(int integer1,int integer2)
    {
        System.out.println("The sum of the integers is" + " " +(integer1 + integer2));
    }
    public void difference(int integer1,int integer2)
    {
        System.out.println("The difference of the integers is" + " " +(integer1 - integer2));
    }
    public void product(int integer1,int integer2)
    {
        System.out.println("The product of the integers is" + " " +(integer1 * integer2));
    }
    public void quotient(int integer1,int integer2)
    {
        System.out.println("The quotient of the integers is" + " " +(integer1 / integer2));
    }

}
