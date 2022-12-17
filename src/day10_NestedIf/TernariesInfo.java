package day10_NestedIf;

import java.sql.SQLOutput;

public class TernariesInfo {
    public static void main(String[] args) {

        int n = 100;
        if (n%2==0){

            System.out.println("Even");//String

            }else {

            System.out.println("Odd");//String
        }

        System.out.println("-------------------------------------------");

        String result= (n%2 == 0)? "Even":"Odd";

        System.out.println(result);

        System.out.println("-------------------------------------------");

        int age = 17;

      /*  if (age>=21){
            System.out.println("Eligible");
        }else{

            System.out.println("Not Eligible");
        }

        System.out.println("-------------------------------------------");*/

        String result1 = (age>=21)? "Eligible" : "Not Eligible";

        System.out.println(result1);

        System.out.println("-------------------------------------------");

        int number = 100;
        /*
        if (number>0){

            System.out.println("Positive");

        }else if (number<0){

            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
            */

       String result2= (number>0)? "Positive" :(number<0)? "Negative" : "Zero";

        System.out.println(result2);


    }

}
