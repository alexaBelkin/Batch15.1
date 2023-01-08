package GroupProject5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Reverse a given String and print it, if they have space in the
        //beginning and at the end then remove it.  Without using a
        //slicing [ : :-1]. Try doing with for loop or while loop.
        //Example:  " Job" -> "boJ"
        // * " Happy " -> "yppaH"
        // * "Sun " -> "nuS"
        // * " Dream Job!" -> "!boJ maerD"

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word to get a reversed word!");
        String str1=sc.nextLine();
        str1=str1.trim();
        //System.out.println(str1);
        String reversed="";

        for(int i=str1.length()-1;i>=0;i--){

            reversed+=str1.charAt(i);

        }System.out.println(reversed);

    }
}
