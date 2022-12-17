package day17_While_DoWhile;

public class RemoveDublicates {

    public static void main(String[] args) {

        String str = "AABBCC";

        String result = "";//AB

        for (int i = 0; i <= str.length()-1; i++) {

            String ch = ""+ str.charAt(i);

            if (result.contains(ch)){//if the result already consist

                continue;
            }

            result+=ch;

        }

        System.out.println(result);
    }
}
