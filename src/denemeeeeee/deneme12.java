package denemeeeeee;

import java.util.Arrays;

public class deneme12 {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 8};

        int[] result = uniqueElement(array);

        System.out.println(Arrays.toString(result));

    }

    public static int frequency(int[] array, int element) {

        int count = 0;

        for (int each : array) {

            if (each == element) {

                count++;
            }

        }


        return count;


    }

    public static int[] addelement(int[] array, int element) {

        int[] result = new int[array.length + 1];
        int i = 0;

        for (int each : array) {

            result[i++] = each;
        }
        result[i] = element;

        return result;
    }

    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {

            if (deneme12.frequency(array, each) == 1) {

                result = deneme12.addelement(result, each);

            }


        }

        return result;
    }
}