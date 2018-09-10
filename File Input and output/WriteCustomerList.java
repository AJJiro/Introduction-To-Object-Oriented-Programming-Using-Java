//Program WriteCustomerList, Lab 14
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018
//This class is used in order to get the user's ID,First Name, Last Name, and Balance owned
//We import all of these things in order to make the file through our program
//We will have two classes one to call the method and another to to have

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCustomerList
{
    
//This methods will throw the checked IOException.
//This is handled by us so that we are able to compile our source code.
//We initialize the filename and make it a txt so that we can save it onto our folder
//We will call writeFile through the main function
    public static void main(String[] args) throws IOException
    {
        String filename = "Customers.txt";
        writeFile(filename);
    }
    
//This methods will throw the checked IOException.
//This is handled by us so that we are able to compile our source code.
//The user will enter their information so that we can save it in a txt.file
//We wil close the file so that it won't get corrupt
    
    public static void writeFile(String filename) throws IOException
    {
        Scanner userInput = new Scanner(System.in);
        File filler = new File(filename);
        PrintWriter getInput = new PrintWriter(new FileWriter(filler, true));

        System.out.print("Enter ID num: ");
        getInput.write(userInput.next());
        System.out.print("Enter First Name:");
        getInput.write(" "+userInput.next());
        System.out.print("Enter Last Name:");
        getInput.write(" "+userInput.next());
        System.out.print("Enter Balance owned:");
        getInput.write(" "+userInput.next());
        getInput.write("\n");
        getInput.close();
    }

}
