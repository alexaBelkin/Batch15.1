package Loops;

import java.util.Scanner;

public class WhilePractise3 {
    public static void main(String[] args) {


    /*
    get a number from user and find the divisor of the given number
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number");
        int number=sc.nextInt();
        int divisor=1;

        while(divisor<=number){

          if (number%divisor==0) System.out.println(divisor);
          divisor++;
        }
    }
}
