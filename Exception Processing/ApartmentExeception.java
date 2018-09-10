//Program ApartmentException, Lab 14
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018

//This class will be used in order to check the ApartmentException restrictions
//We extend the RuntimeException class in order to have our program compile
//This allows us to catch the exceptions in ThrowApartmentException.java
//We are able to see if the input isn't correct
//this allows us to reference the object based on the class

public class ApartmentExeception extends RuntimeException
{
   private String statement;
   public String printPrompt()
   {
       return statement;
   }
   public ApartmentExeception(String statement)
   {
       this.statement = "Your input cannot be processed:" + statement;
   }

}
