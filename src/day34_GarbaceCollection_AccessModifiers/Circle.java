package day34_GarbaceCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi=3.14;

    public static String name="Circle";
    public static ArrayList<Integer> numbers;

    //public static Sheet sheet


    public Circle(double radius){

        this.radius=radius;
       // pi=3.14;Do not ever use static value in the instance method


    }

  static {

        //radius=5; can not be use instance variable in te static block

        pi=3.14;
        name = "Circle";

        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

    }





    /*
  public static void main(String[] args) {
      pi=3.14;
      name="Circle";
      numbers=new ArrayList<>();
      numbers.add(10);
      numbers.add(20);


      System.out.println("pi = " + pi);
      System.out.println("name = " + name);
      System.out.println("numbers = " + numbers);


  }
*/
}


