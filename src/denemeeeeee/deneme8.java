package denemeeeeee;

public class deneme8 {

    public static void main(String[] args) {
        String s= "The game was tied at 2-2";
        String s2 = s.substring(5);

        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");

        if (index1==index2){

            System.out.println(index1);
        }else{
            System.out.println(index2);
        }

        int number =5;
        while(number<100){

            number+=number;
        }
        System.out.println(number);

        int a=0;
        do{

            a= a++ + --a - (a%3);
        }while(++a<4);

        System.out.println(a);

        String str=" The whole time it was raining.";

       /* do{
            System.out.println(str.charAt(0));
            str=str.substring(3);
        }while(!str.isEmpty());*

        */
String str1="cybertek";

        for (int i = 0; i <str1.length(); i+=2) {

            System.out.println(str1.charAt(i));
            
        }


    }
}
