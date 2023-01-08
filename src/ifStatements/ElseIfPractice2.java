package ifStatements;

import java.util.Scanner;

public class ElseIfPractice2 {
    public static void main(String[] args) {
        //TASK
        /* get an int number form user
         * check and print out if the given number is positive number, negative or zero

       */
        Scanner input=new Scanner(System.in);
        System.out.println("please enter integer number");
        int number= input.nextInt();

        if(number>0){
            System.out.println("its a positive number");
        } else if (number<0) {
            System.out.println("Its a negative number");

        } else
            System.out.println("Its a zero");

        }
    }

