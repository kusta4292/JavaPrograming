package day11_Switch_Scanner;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 6.7;
        double n2 = 2.3;
        char operator = 'r';

        if ((operator == '-') || (operator == '+') || (operator == '*') || (operator == '/')) {

            switch (operator) {

                case '-':

                    System.out.println(n1 - n2);
                    break;

                case '+':

                    System.out.println(n1 + n2);
                    break;

                case '*':

                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);
                }


        } else {

            System.out.println("Please use valid operator. This is \""+ operator+"\" wrong operator");
        }


    }

}









/*
Given two double variables n1, n2 and a char variable named operator.
use switch statement to calculate the result of n1 & n2 based on the given operator
		Valid operators are: -, +, *, /
		            @
 */