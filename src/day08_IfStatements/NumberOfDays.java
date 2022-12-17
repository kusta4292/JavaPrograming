package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {
        int day = 2;

        boolean has28Days = day == 2;
        boolean has30Days = day == 4 || day == 6 || day==9 ||day == 11;
        boolean has31Days = day == 1 || day == 3 || day==5 ||day == 7 || day == 8|| day==10 || day == 12;

       if (day == 2){

           System.out.println("28 days");
       }

        if (has30Days){

            System.out.println("30 days");
        }
        if (has31Days){

            System.out.println("31 days");
        }


    }
}
