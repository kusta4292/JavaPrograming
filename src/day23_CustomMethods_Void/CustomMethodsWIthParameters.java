package day23_CustomMethods_Void;

public class CustomMethodsWIthParameters {

    public static void main(String[] args) {
        printNumbers(2, 3);
        //  oddOrEven(); // the method demands additional info to complete its task

      oddnumber(8);

      ageOfPerson(1996);

    }


    // create a function that can check if a number is odd number or even number
public static void oddnumber(int y){

        if (y%2==0){

            System.out.println("even number");

        }else{

            System.out.println("odd number");
        }
}




    // create a function that can display the age of the person

    public static void ageOfPerson(int birthYear){

        int age= 2022-birthYear;

        System.out.println(age);
    }


    //                                                       10       50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){

        System.out.println(x+y);
    }


}