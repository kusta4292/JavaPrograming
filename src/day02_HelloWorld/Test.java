package day02_HelloWorld;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str="aaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";

        str= ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);

        String name="Java Programming";

        String reverseName= ReturnMethodIntro.reverse(name);

        System.out.println(reverseName);
    }
}
