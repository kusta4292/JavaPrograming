package day42_Exceptions;

public class ThrowsKeyWord {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("--------Test1--------------");

        System.out.println("Hello");
        Thread.sleep(3000);
        System.out.println("Cydeo");

        System.out.println("-----------Test1 Completed--------");

        System.out.println("-----------Test2------------");

        System.out.println("Hello");

        Thread.sleep(3000);
        System.out.println("Batch 25");

        System.out.println("-----------Test2 Completed--------");
    }
}
