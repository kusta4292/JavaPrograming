package day42_Exceptions;

import org.w3c.dom.ls.LSOutput;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("--------------Push up started-------");

        for (int i = 1; i <=30 ; i++) {


            //System.out.println("Push up "+i);
            System.out.print("\rPush up "+i);

           sleep(1.5);
        }

        System.out.println("\n----Push ups completed-----");

        System.out.println("\n----Pull ups started-----");

        for (int i = 1; i <=20 ; i++) {


            //System.out.println("Push up "+i);
            System.out.print("\rPull up "+i);

         sleep(2.5);
        }

        System.out.print("\n----Pull ups completed-----");

    }


public static void sleep(double seconds){

    try {
        Thread.sleep((long) (seconds*1000));
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}


}
