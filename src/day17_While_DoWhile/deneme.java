package day17_While_DoWhile;

import java.util.*;

public class deneme {

    Scanner scan =new Scanner(System.in);


    public static void main(String[] args) {
       float f1=(12_345.1>123_45.0)?12_456:124_56.02f;

       float f2=f1+1024;

        System.out.println(f2);


        float f3=(1_560.00>12_60.00)?10:20;

        System.out.println(f3);

        /*line n1*/

       int s =10;

           switch (s){
               case 10:
                   System.out.println("ghj");
               case 11:
                   System.out.println("fghjk");
               default:
                   System.out.println("fghjkl;");
           }


          /* boolean B=true;
           switch (B){
               case true:
                   System.out.println("monday");
               case false:
                   System.out.println("tfyfu");
               default:System.out.println("selam");*/

        int a=5;
        int b= a;

        int num =-5;
        System.out.println(num++ + ",");
        System.out.println(num=0);
        System.out.println(","+ --num);

        short t = 13-9/3*10;
        t+= -10;
        System.out.println(t);
boolean two = false ||true;
        System.out.println(two);

        int d= 10;
        d=--d +d++ + d-- + d++;
        System.out.println(d);

        String str="";
        int num23= 20;
        switch (num23){
            case 0:
                str = "C#";
                break;
            case 10:
                str+="is";
            case 15:
                str= "fun";
            case 20:
                str+="java";
            case 25:
                str+="is";
                break;
            case 30:
                str+="fun";
                break;
            case 35:
                str="python";
            case 40:
                str+="90";


        }
        System.out.println(str);


        double decimal = 13.142;
        int whole = decimal<20?20:10;
        System.out.println(whole);


           }

    }
