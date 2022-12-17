package day07_Operators;

public class UnaryOPerators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1<0);//false

        System.out.println(num2<0);//true

        System.out.println("----------------------------------------------------------------------------------");


        int a=5;
        ++a; //pre increment: increases the value by 1 right away

        System.out.println(a);

        --a; ////pre decrement: decreases the value by 1 right away

        System.out.println(a);

        System.out.println("----------------------------------------------------------------------------------");


        int b = 100;

        System.out.println(++b);// pre increment: increases the value by 1 right away

        int c= 100;

        System.out.println(c++);//post increment: first passes the current value, then increase the value by 1
        System.out.println(c);//101

        System.out.println("----------------------------------------------------------------------------------");

        int x = 200;
        System.out.println(--x);

        int y = 200;
        System.out.println(y--);//post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y);

        System.out.println("-------------------------------------------------------------------------------------");


        int z = 45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47
    }
}
