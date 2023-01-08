package Loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {
        /*
        you/user have $100

        ask user how much is th spending amount
        -if spending is less than balance keep asking user and let him to spend more
        -if the spending is greater than a balance tell user you do not have enough money to spend
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("how much is th spending amount?");
        int spending=sc.nextInt();
        int pocketMoney=100;
        while (pocketMoney>=0){
            pocketMoney-=spending;
            if(pocketMoney>=0){
                System.out.println("You have "+pocketMoney+" on your balance");
                System.out.println("Spend more!How much would you like to spend?");
                spending=sc.nextInt();
            }else{
                System.out.println("you don't have enough money!");
            }
        }
        }
    }

