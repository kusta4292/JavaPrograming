package day15_ForLoop;

public class soru2 {
    public static void main(String[] args) {
        char grade= 'A';

        boolean passed= grade=='A' || grade=='B';
        boolean passed2= grade=='C' || grade=='D';

        if (passed||passed2){

            System.out.println("pasdde axammm");


        }else{
            System.out.println("nany");
        }
    }
}
