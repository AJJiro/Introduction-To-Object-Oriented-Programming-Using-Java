//Program Horse, Lab 12
//Written By: Arman Joachim Chin Jiro Jr.
//Created on July 17, 2018

//This class will allow us the get the data we need for the horse
// We initialize the String name and color and the int birthYear
//grabName,grabColor,grabYear, and assignName will return the functions that will get called in DemoHorse
//public void has a this reference that makes it similar to saying Horse.color. It references to the class

public class Horse
{
    String name;
    String color;
    int birthYear;
    public String grabName()
    {
        return name;
    }
    
    public String grabColor()
    {
        return color;
    }
    public int grabYear()
    {
        return birthYear;
    }
    public void assignName(String name)
    {
        this.name=name;
    }
    
    public void assignColor(String color)
    {
        this.color=color;
    }
    public void assignYear(int birthYear)
    {
        this.birthYear=birthYear;
    }
    
}
