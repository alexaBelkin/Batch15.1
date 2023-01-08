package Loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        //use do-while
        /*
        get to positive integer numbers from user and find the sum of the range
        2,7--->3+4+5+6=18
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number from 2 to 7");
        int num1=sc.nextInt();
        System.out.println("enter number from 2 to 7");
        int num2=sc.nextInt();
        int sum=0;
        num1=num1+1;

        do {

            sum+=num1;
            num1++;

        }while(num1<num2);

        System.out.println(sum);
    }
}
