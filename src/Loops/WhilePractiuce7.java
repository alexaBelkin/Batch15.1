package Loops;

public class WhilePractiuce7 {
    public static void main(String[] args) {
        /*
        find sum of numbers between 10 and 15
        10+11+12+13+14+15=75
         */
        int number=10;
        int number1=15, sum=0;
        while(number<=number1){
            sum=sum +number;
            number++;
        }System.out.println("Sum of the numbers between 10 to 15 is "+sum);
        //find a sum of even numbers from 1 to 15

        int num=1, num1=15,summa=0;
        while(num<num1){
            num++;
            if (num%2==0)
            {summa+=num;}
        }System.out.println("Sum of the numbers "+ summa);
    }
}
