package Loops;

import java.util.Scanner;

public class WhilePractice4task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How much would you like to spend?");
        int spending=sc.nextInt();
        int pocket=100;

        while(pocket>0){
            pocket-=spending;
            if (pocket>0){
            System.out.println("Your balance is " +pocket+ " You can spend more!Please enter your spending?");
            spending=sc.nextInt();}
            else { System.out.println("You don't have enough money!");}
        }

    }

}
