package day16_ForLoopStringPractice;

public class Reverse {

    public static void main(String[] args) {



    String str = "Wooden spoon";
    //index:
    String result = "";//contain the reserved version of str

   /* result+= str.charAt(11);//n
    result+= str.charAt(10);//o
    result+= str.charAt(9);//o
    result+= str.charAt(8);//p
    result+= str.charAt(7);//s
    result+= str.charAt(6);//' '
    result+= str.charAt(5);//n
    result+= str.charAt(4);//e
    result+= str.charAt(3);//d
    result+= str.charAt(2);//o
    result+= str.charAt(1);//o
    result+= str.charAt(0);//w

    */

        for (int i = str.length()-1; i >=0 ; i--) {//i: index nmbers of STR(starting last index to index 0)

            result+=str.charAt(i);



        }
        System.out.println("result = " + result);

    }
}

/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW
 */