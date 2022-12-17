package day10_NestedIf;

import java.net.IDN;

public class NestedIfIntro {

    public static void main(String[] args) {
        int score = 90;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");

            } else {

                System.out.println("Failed");

            }

        } else {

            System.out.println("You are out of range");
        }
        System.out.println("--------------------------------------");

        int age = 25;
        boolean hasId = true;

        if (hasId) {//if the person has ID

            if (age >= 21) {
                System.out.println("eligible to buy alcohol");
            } else {

                System.out.println("not eligible to buy alcohol");
            }

        } else { //if the person does not have an IDN

            System.out.println("He/she get ID");
        }

        System.out.println("--------------------------------------------------------");

        int number = 3;

        if (number > 1 && number <= 7) {//if the number is valid number(1~7 days)
            //7 options

            if (number == 1) {
                System.out.println("Monday");

            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");

            } else if (number == 6) {
                System.out.println("Saturday");
            } else {

                System.out.println("Sunday");
            }
        }else{

            System.out.println("Invalid Number");
        }
    }
}





