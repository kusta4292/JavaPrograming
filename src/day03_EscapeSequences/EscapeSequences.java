package day03_EscapeSequences;

/*
escape sequences: MUST be given with double quote
 \n: start a new line, gives a new line
 \t: tab (paragraph space)
 \\: single backslach
 \": it used for double code


 */
public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java Python C#");
        System.out.println("Java \nPython \nC#");

        System.out.println("------------------------------------------------");

        System.out.println("Hello CYDEO How r you all today? It noice to see you all! What class do we have next week?");
        System.out.println("Hello CYDEO \nHow r you all today? \nIt noice to see you all! \nWhat class do we have next week?");

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("\tJava is cool programming Language");

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("/ \\\\");// in order to one back slash we need to give two backward back slash

        System.out.println("------------------------------------------------------------------------------------");

        System.out.println("My favorite TV show is \"Game of Throne\"");// in order to print double code we need to use \"
    }


}
