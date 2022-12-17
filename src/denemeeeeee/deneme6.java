package denemeeeeee;


import java.util.Scanner;
class deneme6{
    public static void main(String[] args){
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }
        String result="";
        for (String s : arr) {

        result+=s.substring(0,s.length())+", ";

            for (int i = 0; i <s.length() ; i++) {

            }
        }
        //WRITE YOUR CODE BELOW:
        System.out.println(result);
    }
}
/*

### Given a `String []` `arr`, print a pair of items together in one line until all the pairs are printed. A pair is a element and the element next to it. Print each item with a comma in between them.

#### Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:
```
Input:
  [apple, banana, kiwi, grape, milk, soda, juice, coffee] 

Output:
  apple, banana
  banana, kiwi
  kiwi, grape
  grape, milk
  milk, soda
  soda, juice
  juice, coffee
```
    */