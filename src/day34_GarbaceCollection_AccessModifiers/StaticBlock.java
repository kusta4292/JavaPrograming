package day34_GarbaceCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }


    static {//runs first before anything, and only runs one time
        System.out.println("Static Block1");

    }

    static {
        System.out.println("Static Block2");

    }

    static {
        System.out.println("Static Block3");

    }
}
