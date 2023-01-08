package primitives;

public class casting {
    public static void main(String[] args) {
        //implicit -->smaller to larger
        int num=23;
        long num1=num;
        System.out.println(num1);

        // explicit

        int count=25;
        short countSh=(short)count;

        System.out.println(count);
        System.out.println(countSh);

        int number=128;
        System.out.println("number --->"+ number);
        byte numberBt=(byte)number;
        System.out.println("number in byte type ---> " +numberBt);

        double weight =3.4;
        int weight2=(int)weight;
        System.out.println(weight2);

        int example=(int)25.6;


        byte b1=23, b2=12;
        byte sum1=(byte) (b1+ b2);
        System.out.println(sum1);

        // compound assigments --> += -= *= /= %=

        byte result1= 12;
        result1+=example;
        System.out.println(result1);

        // int a=example +1 ---> if you hold 'command' and click on example
        // then it will bring you back to variable creation


    }
}
