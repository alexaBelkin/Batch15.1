package groupProject3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Write a program that works out whether if a given year is a leap
        //year. A normal year has 365 days, leap years have 366, with an
        //extra day in February. The reason why we have leap years is
        //really fascinating, this video does it more justice:
        //https://www.youtube.com/watch?v=xX96xng7sAE
        //1. Take integer variable year
        //2. Assign a value to the variable
        //    3. Check if the year is divisible by 4 but not 100, DISPLAY
        //"leap year"
        // 4. Check if the year is divisible by 400, DISPLAY "leap year"
        //5. Otherwise, DISPLAY "not leap year"

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter year:");
        int year=sc.nextInt();
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println("Lear year");
        }else{
            System.out.println("not leap year");
        }
    }
}
