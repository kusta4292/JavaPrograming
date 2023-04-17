package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{


    public Eagle(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eats Pizza");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+"hunts snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"can fly 50km/h");
    }
}
