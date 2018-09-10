import java.util.Scanner;
public class StringReversals
{

    public static void main(String[] args)
    {
        {
        int i = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Make sure to type your last name then first name after (last, first).");
        String name = userInput.nextLine();
        while(i <= 0)
        {
        if(checkNumber(name))
          System.exit(0);
        else if (checkComma(name))
        {
          System.out.println("Make sure to include the commas");
          name = userInput.nextLine();
          if (name.contains(",")){
          System.out.println("Your name is " + name);
          System.out.println("Your name in reverse is "  + new StringBuilder(name).reverse().toString());
          System.out.println("Please enter any number to exit or keep adding new names");
          name = userInput.nextLine();
          if (checkNumber(name))
          {
              System.exit(0);
          }
        }
        }
        else
        {
          System.out.println("Your name is " + name);
          System.out.println("Your name revesed is "  + new StringBuilder(name).reverse().toString());
          name = userInput.nextLine();
          }
    }
    }
    }



    public static boolean checkComma(String statements)
    {
        char comma = ',';
        char c = ' ';
        for(int i=0; i<statements.length() ; ++i) {
           c = statements.charAt(i);
           if (c != comma)
               return true;
        }
       return false;
    }

    public static boolean isNamedJoe(String name) {
      return name.equals("Joe");
    }

    public static boolean checkNumber(String statements)
   {
       for(int i=0; i<statements.length() ; ++i) //here
       {
           char c = statements.charAt(i);
           if (Character.isDigit(c))
               return true;
       }

        return false;
       }
   }
