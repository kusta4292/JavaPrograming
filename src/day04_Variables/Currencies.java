package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        int dollar = 1000;

        double lira = dollar * 18.23;
        double euro = dollar * 0.99;
        // jpy, pound, peso, cad , riyal

        double jpy = dollar * 142.27;
        double pound = dollar * 0.85;
        double peso = dollar * 56.76;
        double cad = dollar * 1.30;
        double riyal = dollar * 3.76;

        System.out.println("dollar = " + dollar);
        System.out.println("lira = " + lira);
        System.out.println("euro = " + euro);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);



    }
}
