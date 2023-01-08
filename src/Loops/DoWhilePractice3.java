package Loops;

import java.util.Scanner;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        get a positive number from user for that given number create a star tree like following
        --->user enters--->5
        *
        **
        ***
        ****
        *****
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        String star="*";

        do{
            num--;
            System.out.println(star);
            star=star.concat("*");

        }while(num>0);



    }
}
