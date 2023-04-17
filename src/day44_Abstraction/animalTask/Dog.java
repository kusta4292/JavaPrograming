package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color, size);
    }

    public void bark(){

        System.out.println(getName()+"is barking");

    }

    @Override
    public void eat() {

        System.out.println(getName()+"eats Pizza");

           }

    public void play(){

        System.out.println(getName()+"is playing with base ball");



    }
}
