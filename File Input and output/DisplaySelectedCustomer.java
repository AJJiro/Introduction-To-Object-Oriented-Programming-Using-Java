//Program ThrowApartmentException., Lab 14
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 10, 2018
//This class is used in order to search the user's ID,First Name, Last Name, and Balance owned
//We import all of these things in order to make the file through our program
//We will have two classes one to call the method and another to to have
// We are making files in out java source code

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplaySelectedCustomer
{

//We will call searchById through our main function
    public static void main(String[] args) throws FileNotFoundException
    {
        String filename = "Customers.txt";
        searchingThroughID(filename);
    }
    
// We will ask the user for the ID number they would like to search
//We will go through the file and print out a statement that corresponds with their search
//We will check to see if the index of the first value(which is the ID) will match with the userChoice
//We have a counter to see how many duplicates there are of one code.
// If it doesn't equal anything the counter will be zero and it means their aren't any files that match
    
    
    public static void searchingThroughID(String fileName) throws FileNotFoundException
    {
        String line;
        String[] values;
        int counter = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the ID number you would like to search: ");
        String userChoice = userInput.next();
        userInput = new Scanner(new File(fileName));
        System.out.println("These records in file match with the corresponding ID number: ");
        while (userInput.hasNextLine())
        {
            line = userInput.nextLine();
            values = line.split(" ");
            if (values[0].equals(userChoice))
            {
                counter++;
                System.out.println(counter + ".");
                System.out.println("Here is your ID Number:" + values[0]);
                System.out.println("Here is your First Name:" + values[1]);
                System.out.println("Here is your Last Name:" + values[2]);
                System.out.println("Here is your Balance owned:" + values[3]);
                System.out.println();
            }
        }
        System.out.println();
        if (counter == 0)
        {
            System.out.println("Our system doesn't contain a file matching that specific ID number.");
        }
    }
}
