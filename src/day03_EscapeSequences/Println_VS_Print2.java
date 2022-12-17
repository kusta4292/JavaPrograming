package day03_EscapeSequences;

public class Println_VS_Print2 {
    public static void main(String[] args) {

        System.out.println("Knock Knock");
        System.out.println("Who is this");
        System.out.println("This is the Java");

        System.out.println("---------------------");

        System.out.println("Knock Knock");// first it prints knock knock, then it appends a new line
        System.out.print("Who is this");
        System.out.print("This is the Java");

        System.out.println();
        System.out.println("----------------------");

        System.out.println("Hello evryone, how r you all today, Today we will learn Escape Sequences and next we will leran bla bla");

        System.out.print("Hello evryone, how r you all today");// first it prints knock knock,but does not appends a new line
        System.out.print("Today we will learn Escape Sequences and ");
        System.out.print("next we will leran bla bla");

    }
}
// Single line comment goes here

/*Topics
Printlen method
print method
Comments
*/