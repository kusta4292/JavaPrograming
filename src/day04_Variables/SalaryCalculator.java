package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {
        //hourlyRates, weeklyHours

    int hourlyRate = 65;
    int weeklyHours = 45;
    int numberOfWeeks = 52;

    int salary= hourlyRate * weeklyHours * numberOfWeeks;

        System.out.println("total salary is : $" + salary);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salary = $" + salary);
        System.out.println("hourlyRate = " + hourlyRate);




    }
}
