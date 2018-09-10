//Program Apartment, Lab 14
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018

// This class will check if the number of bedrooms is less than 1 or more than 4
// It will also check if the rent is less than $500 or more than $2500
// This class will also have a method that gets each attribute and returns it toString
//toString returns the textual representation of the our return statement under toString()
//We throw the exception in Apartment.java under the conditions we have


public class Apartment
{
   String streetAddress;
   int apartmentNumber;
   int bedrooms;
   double rent;
   public Apartment(String address, int number, int numberOfBeds, double rent)
    {
       placeStreetAddress(address);
       placeApartmentNumber(number);
       placeBedrooms(numberOfBeds);
       placeRent(rent);
   }

   public String getStreetAddress()
   {
       return streetAddress;
   }

   public void placeStreetAddress(String streetAddress)
   {
       this.streetAddress = streetAddress;
   }

   public int getApartmentNumber()
   {
       return apartmentNumber;
   }
    

//Uses the if statements in order ot check the conditions that are being placed

   public void placeApartmentNumber(int apartmentNumber)
   {
       if(apartmentNumber>=100 && apartmentNumber<=999)
           this.apartmentNumber = apartmentNumber;
       else
           throw new ApartmentExeception(String.valueOf(apartmentNumber));
   }

   public int getBedrooms()
  {
       return bedrooms;
   }

    //Uses the if statements in order ot check the conditions that are being placed
   public void placeBedrooms(int bedrooms)
    {
       if(bedrooms<1 || bedrooms>4)
           throw new ApartmentExeception(String.valueOf(bedrooms));
       else
       this.bedrooms = bedrooms;
   }

   public double getRent()
   {
       return rent;
   }
//Uses the if statements in order ot check the conditions that are being placed
   public void placeRent(double rent)
   {
       if(rent<500 || rent >2500)
           throw new ApartmentExeception(String.valueOf(rent));
       else
           this.rent = rent;
   }
//toString returns the textual representation of the our return statement under toString()
   public String toString()
    {
       return "The apartment adress is :" + streetAddress + ", \nThe apartment number is= " +apartmentNumber + ", \nThe amount of bedrooms are " + bedrooms + ", \nThe amonut of rent is = $" + rent;
   }

}
