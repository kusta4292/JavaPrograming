package day16_ForLoopStringPractice;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "aabbaacc";

        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {//i:represent the index numbers of str (start from 0)

           // String ch = "" + str.charAt(i);// represent each caharacter of str

            if (!result.contains(str.charAt(i)+"")) {
                result += (str.charAt(i)+"");
            }
        }


            System.out.println(result);
        }
    }

