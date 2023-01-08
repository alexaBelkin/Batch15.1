package Loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {
        /*
        get a positive number from user
        and create a multiplication table for given number for up to 10
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        int number=sc.nextInt();
        int number1=1;

        while(number1<=10){
            System.out.println(number*number1);
            number1++;
        }

    }
}
