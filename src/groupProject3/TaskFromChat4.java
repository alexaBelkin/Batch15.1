package groupProject3;

import java.util.Scanner;

public class TaskFromChat4 {
    public static void main(String[] args) {
        //Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a character from (a to z/ A to Z): ");
        char letter=sc.nextLine().charAt(0);
        if (Character.isUpperCase(letter)){
            System.out.println("its uppercase ");
        }else
            System.out.println("its lowercase ");
    }
}
