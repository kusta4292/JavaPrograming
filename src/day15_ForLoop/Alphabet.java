package day15_ForLoop;

public class Alphabet {

    public static void main(String[] args) {
        //A~Z
      for (int i = 65; i<=90; i++){

          System.out.print(i+" ");
      }

        System.out.println();

        for (char i ='A'; i<='Z'; i++){

            System.out.print(i+" ");
        }

        System.out.println();

        for (char i ='a'; i<='z'; i++){

            System.out.print(i+" ");
        }
        System.out.println();
        for (char i ='Z'; i>='A'; i--){

            System.out.print(i+" ");
        }

        System.out.println();
        for (char i ='z'; i>='a'; i--){

            System.out.print(i+" ");

            System.out.println("=----------------------------------------------------------------------------");

            for (char y = 1; y<=40; y++){
                System.out.print(y+" ");
            }
        }

    }



}
/*


A~Z
a~z
Z~A
z~a

 */