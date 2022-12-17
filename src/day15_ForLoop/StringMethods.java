package day15_ForLoop;

import java.sql.SQLOutput;

public class StringMethods {

    public static void main(String[] args) {

        String str = " ";

        boolean r = str.isEmpty();

        System.out.println(r);

        boolean r1 = str.isBlank();

        System.out.println(r1);

        String str2 = " cydeo ";

        System.out.println(str2.isBlank());

        System.out.println("--------------------------------------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2));

        //Yes, YES, yES, YEs......

        System.out.println("yES".equalsIgnoreCase("yes"));

        System.out.println("--------------------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java");
        boolean hasJava4= sentence.equalsIgnoreCase("jaVa");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(hasJava4);

        System.out.println("--------------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//False
        System.out.println(input1.equalsIgnoreCase(input2));//false because texts are not equal

        System.out.println(input1.contains("Java"));//true

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toLowerCase().contains("JAVA"));//false

        System.out.println("---------------------------------------------------------------------------");

        String a = "Wooden Spoon";
       boolean x = a.startsWith("Woo");
       boolean y = a.endsWith("Spoon");

        System.out.println(x);
        System.out.println(y);


    }
}
