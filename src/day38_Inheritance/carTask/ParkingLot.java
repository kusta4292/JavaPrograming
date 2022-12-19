package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2020,20000,"Gray",23566);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);

        BMW bmw = new BMW("X5", 2020,75000, "Black",1200);

        toyota.start();
        tesla.start();
        bmw.start();

    }



}
