package day5_Concatenation;

public class ShippingAddress {


    public static void main(String[] args) {
        //Declaring multitime by using same datatype
      /*  String name = "James King",
                buildingNumber = "11821B",
                streetName = "Jones Branch Dr.",
                city = "Mclean",
                state = "VA",
                zipCode = "22031A";
                */


        String name = "James King";
        String buildingNumber = "11821B";
        String streetName = "Jones Branch Dr.";
        String city = "Mclean";
        String state = "VA";
        String zipCode = "22031A";


      //  System.out.println(name+"\n"+buildingNumber+" " + streetName+"\n"+ city +", "+ state +" "+ zipCode);


        String shipping_Address = name+"\n"+buildingNumber+" " + streetName+"\n"+ city +", "+ state +" "+ zipCode;

        System.out.println("Shipping Address\n" + shipping_Address);
    }

    /*
    Declare the following variables

    name
    buildingNumber
    streetName
    city
    state

    EX:
    Jimmy JOE
    7925 Jones Branch Dr
    Mclean, VA 20125


     */
}
