package denemeeeeee;

import java.util.Arrays;

public class deneme11 {

    public static void main(String[] args) {

        int arrayy[] = {2, 3, 4, 5, 5, 6, 6, 7};
        int elementt = 5;

        int last = frequencyElement(arrayy, elementt);
        int [] last1 = uniqueElements(arrayy);

        System.out.println(last);
        System.out.println(Arrays.toString(last1));
    }
    public static int[] addElements(int[] arrayy, int elementt){
        int result[]= new int [arrayy.length+1];

        int i=0;

        for (int each : arrayy) {

            result[i++]=each;

        }
        result[i]=elementt;

        return result;
    }


    public static int frequencyElement(int[] arrayy, int elementt) {
        int count = 0;

        for (int each : arrayy) {

            if (each == elementt) {

                count++;
            }

        }
        return count;


    }
    public static int[] uniqueElements(int[] arrayy) {

        int result[] = {};

        for (int each : arrayy) {

         if( deneme11.frequencyElement(arrayy,each)==1){

                result=deneme11.addElements(result, each);

         }


            
        }
        return result;
    }

}





