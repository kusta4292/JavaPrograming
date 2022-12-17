package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {
        //boolean
        //float
        //long
        //double these are can not be use in the switch statement

        //I we don't give the break statement the next statement will execute until the break statement or} of the switch
        int number = 7;
        String nameOfDay = "";

        switch (number) {//1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;//exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break; //exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break; //exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
                System.out.println("Invalid data");
                //break;//If you use the default end of the code fragment you do not have to use break because of the curly breaks
                // which stay end
                // only get executed if none of the case blocks are matching
        }
    }
}
