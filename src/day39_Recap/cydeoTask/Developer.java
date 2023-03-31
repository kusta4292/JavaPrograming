package day39_Recap.cydeoTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int employeeID, String jobTitle, int salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+ " is developing application");
    }

    public void fixingBugs(){

        System.out.println(getJobTitle()+" "+getName()+" is fixing the bug");


    }
}
