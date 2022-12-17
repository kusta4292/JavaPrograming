package denemeeeeee;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        boolean isTall = scan.nextBoolean();
        boolean isFast = scan.nextBoolean();
        boolean isFlexible = scan.nextBoolean();
        String sport = "";

        if (isTall){
            if (isFast){
                sport= "Basketbal";

            } else if (isFlexible) {
                sport = "gymnastics";

            }else{
                sport = "voleybal";
            }
        }else{
            if(isFast){
                sport= "soccer";

            }else{
                sport="tennis";
            }
        }

        System.out.println(sport);

    }


}
