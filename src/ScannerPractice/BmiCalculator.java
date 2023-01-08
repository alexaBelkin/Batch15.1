package ScannerPractice;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        //BMI= weight(kg)/(height(m)*height(m); >> 18-24
        //calculate BMI for user

        Scanner input= new Scanner(System.in);
        System.out.println("What is your weight?");
        double weight= input.nextDouble();
        System.out.println("What is your height?");
        double height=input.nextDouble();
        double BMI=weight/(height*height);
        System.out.println("Your BMI is "+ BMI);



    }
}
