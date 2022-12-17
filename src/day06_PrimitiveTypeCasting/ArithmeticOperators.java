package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {


        System.out.println(100/3);//33

        System.out.println(10.0/4);//2.5

        System.out.println(10/4.0);//2.5

        System.out.println(10d/4);//2.5

        int a = 100;
        double b = a/6;

        System.out.println(b);

        double c = a/6.0;

        System.out.println(c);

        double c1 = a/6d;

        System.out.println(c1);

        double c2 = (double) a/6;

        System.out.println(c1);


    }


}
/*
+: Addition
-: Subtract
*: Multiplication
/: Division
             integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal


        in math:
        10/4 = 2.5
        100/3 = 33.3333.....

        in java:
        10/4 = 2
        10.0/4 = 2.5



 */