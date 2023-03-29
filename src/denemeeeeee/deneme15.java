package denemeeeeee;
import java.util.Scanner;
public class deneme15 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num) {

        boolean result = false;

        if (num % 2 == 0) {

            result = true;

        } else {

            result = false;


            //WRITE YOUR METHOD


        }

        return result;
    }
}






