package day39_Recap.cydeoTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, int salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void createTicket(){

        System.out.println(getJobTitle()+" "+getName()+" is creating ticket");


    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+ " is testing application");
    }
}

