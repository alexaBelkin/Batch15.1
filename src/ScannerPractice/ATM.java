package ScannerPractice;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //David wants to deposit his money into his bank account
        //-he already got $200 in his account
        //-he got three different paychecks ($480, $600 and $350)
        //-he can only deposit one paycheck at a time
        //-after he got his money in the account
        //- he bought a phone for $599 and headphone for $299
        //- calculat his final money in his account
        //open a new class under scanner package and name it as "MoneyTransaction"

        Scanner input= new Scanner(System.in);
        System.out.println("How much money in your account?");
        int moneyInAccount=input.nextInt();
        System.out.println("How much do you want put in your account?(only one check per 1 time)");
        int check1=input.nextInt();
        int leftOver=moneyInAccount+check1;
        int phone=599; int headphone=299;
        int leftOnYourAc=leftOver-phone-headphone;
        System.out.println("You have "+leftOnYourAc+" on your account");
        System.out.println("How much do you want put in your account?(only one check per 1 time)");
        int moneyInAccount2=input.nextInt();
        int leftOver3=moneyInAccount2+leftOnYourAc;
        System.out.println("You have "+leftOver3 + " on your account. Please put your next check");
        int check3=input.nextInt();
        System.out.println("Your balance is "+(leftOver3+check3));


    }
}
