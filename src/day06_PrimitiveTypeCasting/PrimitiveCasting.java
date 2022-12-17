package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {

    public static void main(String[] args) {


        byte a = 100;
        short b = a;
        //short b = (short) a;
        // (short)a

        int c = b ; //implicit casting
        //int c = (int)b

        long d = c;
        //(long)c

        float e = d;
        double f = e;

        //Smaller primitives can be directly assigned to larger primitive type
        // Larger primitives can NOT directly assigned to smaller primitive types (need to  be casted manually)

        System.out.println("---------------------------------------------------------------");

        int x =55;
        short y = (short) x;

        System.out.println(x+ " : "+y);

        System.out.println("-------------------------------------------------------------------------------");

        //double>float>long>int>short>byte

        long j = 1000000;
        short k = (short) j;


        System.out.println(j+" : "+ k);

        double l = 2.5;
        float m = (float) l;

        System.out.println(l + " : " + m);


        double n = 10.8;
        int s = (int) n;

        System.out.println(n+ " : "+ s);

        System.out.println("-------------------------------------------------------------------");

        double d1 = 20.5;

        short s1 = (short) d1;

        System.out.println(d1+" : "+s1);

        float f1 = 30.5f;
        long l1 = (long) f1;

    }






}
