package day04_Variables;

public class EmployeeInfo {

    /*
    6. Create a class named EmployeeInfo. declare the following
variables:
1. name (String)
2. age (int)
3. gender (char)
4. company (String)
5. jobTitle (String)
6. yearsOfExpereince (double)
7. salary (int)
8. isFullTime (boolean)
9. isMarried (boolean)
10. employeeId (String)
11. SSN (String)

     */

    public static void main(String[] args) {

        String name = "Maria";
        int age = 16;
        char gender = 'F';
        String company = "Apple Inc.";
        String jobTitle = "SDET";
        double yearsOfExperience = 9.5;
        int salary = 120000;
        boolean isFullTime = true;
        boolean isMarried = true;
        String denemeId = "345677654";
        String ssn = "(123)-45-6789";


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("denemeId = " + denemeId);
        System.out.println("ssn = " + ssn);


    }
}

