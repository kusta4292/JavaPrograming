package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        
        //assignment
        
        int number = 100;
        System.out.println("number = " + number);//100
        
        number=200;

        System.out.println("number = " + number);//200
        
        String word = "Java Programing";
        System.out.println("word = " + word);//Java Programing
        
        word= "Wooden Spoon";

        System.out.println("word = " + word);
        
        word= "Cydeo";

        System.out.println("word = " + word);

        word = "123" + 1;

        word = "Java Programming";

        System.out.println("word = " + word);

        System.out.println("----------------------------------------------------------------------------------------");

        //Addition Assignment:

        int x = 100;
        System.out.println("x = " + x);
        System.out.println(x+200);//300

        //x=x+200;

        x+=200;

        System.out.println("x = " + x);

        System.out.println("----------------------------------------------------------------------------------------");

        String str = "Wooden";

        str+= " Spoon";

        System.out.println("str = " + str);

        double num1 =2.5;

        System.out.println("num1 = " + num1);//2.5

        num1+= 5.5;

        System.out.println("num1 = " + num1);


        double avaliableBalance = 1000.50;

        avaliableBalance+=300;

        System.out.println("avaliableBalance = " + avaliableBalance);//1300.50

        System.out.println("----------------------------------------------------------------------------------------");

        //withdrawing 500$

        avaliableBalance-=500;

        System.out.println("availableBalance = " + avaliableBalance);


        //witdrawing 200$ than depositing 400$

        avaliableBalance-=200; // avaliable balance= 600.5

        avaliableBalance+=400;// avaliable balance

        System.out.println("avaliableBalance = " + avaliableBalance);


        System.out.println("----------------------------------------------------------------------------------------");

        double salary = 50000.50;
        salary*=2;

        System.out.println("salary = " + salary);


        double doge = 0.00000001;

        doge *=1000000;

        System.out.println("dodge = " + doge);

        System.out.println("----------------------------------------------------------------------------------------");

        double num2 = 25000;
        num2/=2;

        System.out.println("num2 = " + num2);

        System.out.println("----------------------------------------------------------------------------------------");


        double num3 = 100;

        num3%=3;
        System.out.println("num3 = " + num3);

        System.out.println("----------------------------------------------------------------------------------------");

        int amount = 127;//cents

        int quarters = 127/25;

        int cents = 127%25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("----------------------------------------------------------------------------------------");

        int cents2 = 127;
        cents2%=quarters;
        System.out.println("cents2 = " + cents2);

        System.out.println("----------------------------------------------------------------------------------------");

        int y =300;
        y%=16;

        System.out.println("y = " + y);

        System.out.println("----------------------------------------------------------------------------------------");

        int balance =3500;

        //insurance fee = $153

        balance%=153;

        System.out.println("balance = " + balance);















    }
    
    
    
}
