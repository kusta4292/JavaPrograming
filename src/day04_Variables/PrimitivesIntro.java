package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

    //age:38 years old

        byte age = 38;
            System.out.println(age);

    //weight:160 pounds

    //    byte weight = 160; 160 out of byte range  (range -128 to 127)
    //    byte num = -129;   129 is out of byte range

    //   -----------------------------------------------------------

        short weight = 160;  //(-32768 to 32767)

        //salary: 100000 $

        //short salary =100000;//100000 is out of short range

        //----------------------------------------------------------------

        int salary = 100_000; //preferred data type for integer numbers//If you want to make readable for this digit
                                                                            // you can use _ after every three digits

        //------------------------------------------------------------------------------------

        long asset =  3_333_333_333L;// Always right side data type is integer.
                                    // if the data (right side) out of the int range you have rename as Long
                                    //In order to take this number you put to L or l to get long primitive data type

        long asset1 = 20_000;


        //-------------------------------------------------------------------------------------------------------


        //tax: 0.26

        //int tax = 0.26; // hata verir

        float tax = 0.26F; // Always right side data type is double when we are use decimal number.
                             //In order to use this number you put to L or l to get long primitive data type


    //---------------------------------------------------------------------------------------------

        char ch1 = '#';

        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 6700;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        char grade = 'F';
        char yesNo = 'Y';

        //-----------------------------------------------------------------------------------
        boolean isEmployeed = true;
        boolean isMarried = false ;


        boolean result = 100>300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        //-----------------------------------------------------------------------------------------------------------

        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country = "USA";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

    //--------------------------------------------------------------------------------------------------------------

        String first_name$ = "Muhtar";
        int num1 = 100;








    }
}
