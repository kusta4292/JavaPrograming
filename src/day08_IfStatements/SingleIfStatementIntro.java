package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;// not even number

        if (evenNumber) {//even numbers

            System.out.println(number + " is even number");

        }

        if (!evenNumber) {// not even number

            System.out.println(number + " is odd number");
        }

        if (oddNumber) { // not even number

            System.out.println(number + " is odd number");


        }
        System.out.println("----------------------------------------------------------------------------------");

        int n = 200;
        //positive
        //negative
        //zero

        if (n > 0) {// if the n greater than zero, then it is positive

            System.out.println(n + "is positive");


        }

        if (n < 0) { // if n is less than zero, then it is negative

            System.out.println(n + "is negative");
        }

        if (n == 0) {

            System.out.println(n + "is zero");


        }
    }
}
/*

        System.out.println("Odd Number");

        System.out.println("Even Number");

         */