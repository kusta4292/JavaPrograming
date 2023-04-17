package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color, size);
    }

    @Override
    public void eat() {

        System.out.println(getName()+"eats biryani");

    }

    public void meow(){

        System.out.println(getName()+"is Meowing");
    }

    @Override
    public void play() {

    }
}
