package day18_NestedLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String userName = scan.next();

        System.out.println("Enter your password");
        String p = scan.next();

        if (userName.equals("Cydeo")&& p.equals("WoodenSpoon")){

            System.out.println("Logged in");



        }else{

            for (int i = 0; i < 3; i++) {

                System.out.println("Incorrect username or password");
                System.out.println("Enter your username");
                userName=scan.next();
                System.out.println("Enter your password");
                p=scan.next();

                if (userName.equals("Cydeo")&& p.equals("WoodenSpoon")){

                    System.out.println("Logged in");
                    break;
                }


            }

            if(!(userName.equals("Cydeo")&& p.equals("WoodenSpoon"))){

                System.out.println("Your account is locked, Please contact support team");
            }
        }




    }



}

/*
  2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon
                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */
