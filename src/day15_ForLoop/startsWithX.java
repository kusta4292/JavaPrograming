package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        String word = new Scanner(System.in).next();//xcodex

        if (word.charAt(0)=='x'||word.charAt(0)=='X'){

            word = word.replace("x","a"   ).replace("X","a");//acodex
        }

        System.out.println(word);
    }
}

/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */