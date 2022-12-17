package day12_Scanner;

//import java.util.*; wild import: imports everything from the package

import java.util.Scanner; // regular import: import one class



public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7:");

        int num = scan.nextInt();

        String result = "";

        if(num>=1 && num<=7){


            //result = (num==1)? "Monday" :(num==2)?"Tuesday" : (num==3)? "Wednesday" : (num==4)? "Thursday" : (num==5)?"Friday"

            //:(num==6)? "Saturday" : "Sunday";

            if (num==1){

                result= "Monday";

            } else if (num==2){

                result = "Tuesday";

            } else if (num==3){

            result = "Wednesday";

            }else if (num==4){

                result = "Thursday";

            } else if (num==5){

                result = "Friday";

            } else if (num==6) {

                result = "Saturday";
            }else{

                result = "Sunday";
            }

        }else{
            result ="Invalid number";

        }

        System.out.println("result = " + result);

        scan.close();
    }



}
