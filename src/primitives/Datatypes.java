package primitives;

public class Datatypes {
    public static void main(String[] args) {
        byte bt1=3;
        System.out.println(bt1);

        short numberSH=1234;
        System.out.println(numberSH);

        long number12=487575799439L;
        System.out.println(number12);

        float numberF=1.344f;
        System.out.println(numberF);

        float number6=.7f;
        System.out.println(number6);

        float number7= 6f;
        System.out.println(number7);

        double numberD=2;
        System.out.println(numberD);

        byte b1=5;
        short sh1= b1;
        System.out.println(sh1);

       // byte bt2= sh1;  --> won't work because of different storage size
        // int age=2.5; ---> won't work
        // int age=numberD;  ---> won't work because of different data types

        System.out.println(Short.MIN_VALUE);

        int number10= 100_0000;
        System.out.println(number10);








    }
}
