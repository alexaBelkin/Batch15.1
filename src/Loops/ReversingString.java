package Loops;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        //check if given string is palindrome or not
        //efe,yay,tuesday,wow,civic,level,anna....
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word to check if its a polindrome");
        String word=sc.nextLine();
        String reversed="";

        for(int i=word.length()-1;i>=0;i--){
            reversed+=word.charAt(i);
            }if (word.equals(reversed)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }

        }
    }

