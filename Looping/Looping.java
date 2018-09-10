//Program Looping, Lab 7
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 3, 2018
//This program will take the input of the user and calculate the highest,lowest scores
// Furthermore, it gives the arithmetic average and will give the total of scores.
import java.util.Scanner;

public class Looping
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        int numberOfScores = 0;
        int sum = 0;
        int highestScore = -1;
        int lowestScore= 101;
        double average;
        System.out.println("From 0-100 what was the grade that student got?");
        System.out.println("Enter 999 to exit the program");
        int integer1 = userInput.nextInt();
        while (integer1<= 999)
        {
        if (integer1 !=999)
        {
            if (integer1>=0 && integer1<=100)
                {
                sum+=integer1;
                ++numberOfScores;
                if (integer1>highestScore)
                    highestScore=integer1;
                if (integer1<lowestScore)
                    lowestScore=integer1;
                System.out.println("From 0-100 what was the grade that student got?");
                System.out.println("Enter 999 to exit the program");
                integer1 = userInput.nextInt();
                }
            else
                {
                 System.out.println("You choose a wrong number pick a number between 0 and 100.");
                 System.out.println("Enter 999 to exit the program");
                 integer1 = userInput.nextInt();
                }
        }
        else
            {
//display the number of scores entered, the highest score, the lowest score, and the
//arithmetic average.
            average = (double) sum/ numberOfScores;
            System.out.println("The number of scores is " +numberOfScores);
            System.out.println("The highest score is " + highestScore);
            System.out.println("The lowest score is " + lowestScore);
            System.out.println("The arithmetic average is " + average);
            System.exit(0);
            }




        }
    }
}
