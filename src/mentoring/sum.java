package mentoring;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        /*
        Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter int number 1");
        int num1=sc.nextInt();
        System.out.println("Please enter int number 2");
        int num2=sc.nextInt();
        if(num1!=num2){
            System.out.println("Sum of num1 and num2 is: "+(num1+num2));
        }else{
            System.out.println("Multiplacation is "+(num1*num2));
        }


    }
}
