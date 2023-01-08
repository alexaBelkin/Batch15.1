package groupProject3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number:");
        int number=sc.nextInt();
        if (number%2==0){
            System.out.println("Your number is EVEN!");
        }else{
            System.out.println("Your number is ODD!");
        }
        //String result= (number%2==0)? "even":"odd";
        //System.out.println(result);
    }
}
