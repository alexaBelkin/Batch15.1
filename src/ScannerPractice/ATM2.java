package ScannerPractice;

import java.util.Scanner;

public class ATM2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        double balance=200;
        System.out.println("please enter first deposit");
        double firstCheck=input.nextDouble();
        balance=balance+firstCheck;

        System.out.println("please enter second deposit");
        double secondCheck=input.nextDouble();
        balance+=secondCheck;

        System.out.println("please enter second deposit");
        double thirdCheck=input.nextDouble();
        balance+=thirdCheck;
        System.out.println("Your balance is "+ balance);

        System.out.println("please enter phone price");
        double phone$=input.nextDouble();
        balance-=phone$;

    }
}
