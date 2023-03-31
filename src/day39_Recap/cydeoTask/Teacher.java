package day39_Recap.cydeoTask;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, int salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is teaching");
    }
}
