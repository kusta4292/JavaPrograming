package day39_Recap.cydeoTask;

import java.sql.SQLOutput;

public class Person {

    /*
Create a class named Person:
Variables:

name, age, gender

Encapsulate all the fields

Add a constructor to set all the fields

Methods:

eat()
drink()
sleep()
toString()
     */

    private String name;
    private int age;
    private char gender;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){

            System.err.println("Name can not be null");
            System.exit(1);


        }if(name.isEmpty()|| name.isBlank()){

            System.err.println("Invalid Name");
            System.exit(1);
        }


        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){

        System.out.println(name+" is dirinking");
    }

    public void sleep(){

        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
