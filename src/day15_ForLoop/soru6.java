package day15_ForLoop;

public class soru6 {

    public static void main(String[] args) {

        int x=10;
        int y=x++;


        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println(y++ +" "+x++ + " "+y+" "+x++);
    }
}
