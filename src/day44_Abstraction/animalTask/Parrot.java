package day44_Abstraction.animalTask;

public final class Parrot extends Animal implements Playable, Flyable{


    public Parrot(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color, size);
    }

    @Override
    public void eat() {

        System.out.println(getName()+"eats chocolote");

    }

    @Override
    public void play() {

    }

    @Override
    public void fly() {
        System.out.println(getName()+"can fly 20 km/h");
    }
}
