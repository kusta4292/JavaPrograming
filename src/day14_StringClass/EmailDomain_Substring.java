package day14_StringClass;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email= "Cydeo.School@gmail.com";

        //domain

        int beginningIndex = email.lastIndexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println("domain = " + domain);

        System.out.println("-----------------------------------------------------------------------------------");

        String str1 = "Java is fun, Java is cool";

        //

        String s1 = str1.substring(0,10+1); //Java is fun

        System.out.println("s1 = " + s1);

        String s2 = str1.substring(str1.lastIndexOf("J"));

        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------------------------------------------------------------");

        String name = "Java";

        System.out.println((name+ " ").repeat(5));



    }

}
/*

Write a program that can get domain of the email.( Assume that a valid email is given)

ex.
e mail = Cyde.School@gmail.com

output: gmail

e mail= "School.Cydeo@yahoo.com

output: yahoo




 */