package primitives;

public class Remainder {
    public static void main(String[] args) {
        // remainder --> %--> remainer/ modulus operator will find left over a division question

        int number1=17, number2= 5;
        int r1=number1%number2;
        System.out.println(r1 + " is the left over fromn divining " +number1 + " and "+number2);

        int number3= 123;
        // find out remaaind of 123 when its divided by 10


        int r2=number3%10;
        System.out.println(r2);

        int number=345;
        int nRem1, nDiv1, nRem2, nDiv2;
        nRem1=number%10; //5
        nDiv1=number/10; // 34
        nRem2=nDiv1%10;
        nDiv2=nDiv1/10;




    }
}
