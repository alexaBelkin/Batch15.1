package groupProject3;

import java.util.Scanner;

public class Task6 {
    //Roller coster
    //Write a program that determines if the user can ride a rollercoaster.
    //To ride the rollercoaster, you must be at least 120 cm tall. You must also
    //be at least 9 years old.
    //If you under 18 years old your ticket cost 7$ if you older 18 your ticket
    //cost 12$.
    //Ask the user how tall and how old they are. Use a nested if statement to
    //determine if they can ride the rollercoaster.
    //If they can, print "Welcome aboard." and Ticket price
    //If they cannot, print "Sorry, you are not eligible to ride, you have to be at
    //least 120 cm ".
    //If they cannot, print "Sorry, you are not eligible to ride you are too young
    //".

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How tall are you?:");
        int height=sc.nextInt();
        int ticket1=7, ticket2=12;

        if (height>=120){
            System.out.println("How old are you?:");
            int age=sc.nextInt();
            if(age>=9){
                if(age<=18){
                    System.out.println("Welcome aboard!Your ticket price is "+ticket1+"$");
                }else if(age>18){
                    System.out.println("Welcome aboard!Your ticket price is "+ ticket2+"$");}
            }else if(age<9){
                System.out.println("Sorry, you are not eligible to ride you are too young");}
        } else if(height<120) {
            System.out.println("Sorry, you are not eligible to ride, you have to be at least 120 cm ");
        }
    }
}
