package day14_StringClass;

import javax.lang.model.SourceVersion;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = " Java is fun, I love learning Java";

        String str2 = str.replace("Java", "Python");//" Python is fun, I love learning Python"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("---------------------------------------------------------------------------------------");

        String email = "JohnSmith@yahoo.com";

        email= email.replace("yahoo", "gmail");//JohnSmith@gmail.com

        System.out.println("email = " + email);//gmail

        System.out.println("---------------------------------------------------------------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";

        String sentence2 = sentence.replace("Python", "").replace("   ", " ");

        System.out.println("sentence = " + sentence);

        System.out.println("sentence2 = " + sentence2);

        System.out.println("---------------------------------------------------------------------------------------");

        String s = "Dog Dog Dog Dog Dog Dog";

        s= s.replace("Dog" , "Cat");//

        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2= s2.replace(" C#", " Java");

        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------------------------------------------------------------");

        String s3= "Java";

        s3 = s3.replace("a", "c");//Jeve

        System.out.println(s3);

        System.out.println("---------------------------------------------------------------------------------------");

String result = "Java Java Java";

result = result.replaceFirst("Java","Python");

        System.out.println("result = " + result);


        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#","Java");

        System.out.println("result2 = " + result2);

        System.out.println("---------------------------------------------------------------------------------------");

        String result3 = "Java";
        result3 = result3.replaceFirst("va","o");

        System.out.println("result3 = " + result3);
    }
}
