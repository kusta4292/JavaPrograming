package day44_Abstraction.animalTask;

public final class Tiger extends  Animal implements WildAnimal{


    public Tiger(String name, String breed, char gender, int age, String color, String size) {
        super(name, breed, gender, age, color, size);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"eats deer");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+"hunts deer");
    }
}
