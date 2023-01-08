package GroupProject5;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Ask the user to enter one in number between 1 to 10 then, Write the
program to print the string in the following format:
Search to see what happens when you multiply the string with
numbers and use it for solving this question.
Example:
Input: 6
Output:
666666
55555
4444
333
22
1
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number from 1 to 10");
        int num=sc.nextInt();
        String word="";
        for (int i = num ; i > 0; i-- ) {
            for ( int k = 0; k < i; k++){
                word = "" + i;
                System.out.print(word);
            }
            System.out.println(" ");
        }

    }

}

