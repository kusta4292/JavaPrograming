package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};
        int max = numbers[0];// 20

        for (int i = 0; i < numbers.length; i++ ) {
            int last= numbers[i];

            if(last > max ){ // if there is element in the array that's greater than the current max number
                max = last; // assigning greater number to variable max
            }

        }

        System.out.println(max);


    }

}
