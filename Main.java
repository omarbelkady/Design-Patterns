public class Main
{
    public static void main(String [] args)
    {
        Dog eva = new Dog();
        eva.setName("Eva");
        /*
        DO NOT DO THIS !!!!!!!
        eva.Name= "Eva";
        */
    }
}

WE DO NOT DO THAT BECAUSE OF WHAT'S CALLED ENCAPSULATION. Encapsulation allows us to protect our info.
import java.util.Scanner;
import java.util.*;
class Dog{
  private String name;
  private double height;
  private int weight;
  
  public void setName(String newName)
  {
      name= newName;
  }
  
  public String getName()
  {
      return name;
  }
  
  public static void main(String [] args)
  {
     
  }

}



newWeight is a parameter.
eva.setName("Eva");
Eva is an argument it is the value passed to the method setName
Setters are the Mutators they allow us change the value of variables.
Getters are the Accessors. They allow us to access data to get a specific value.
