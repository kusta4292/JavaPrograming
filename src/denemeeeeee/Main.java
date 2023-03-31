package denemeeeeee;

import java.util.Scanner;

class Main {

    public static String profit(int buyPrice, int sellPrice) {

        String result = "";

        if (buyPrice < sellPrice) {

            result = "profit";

        } else if (buyPrice > sellPrice) {

            result = "loss";
        } else {

            result = "no loss";
        }
return  result;
    }



        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }

}


/*

### Finish the method called `countAppearance()` that will take `String []` and `String`
arguments and return an `int` for the number of times the given `String` `word`
 is found in the given `String []` `arr`.

#### This is a `return` method with `String[]` and `String` parameters

Main topics: methods, Scanner, loops, String, arrays, primitive datatypes, operators, if statements

Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "foo")

output:
  2
```
Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "bla")

output:
  1
```
Example:
```
  arr = ["a","foo","bar","foo","bla"];
  countAppearance(arr, "java")

output:
  0
```*/