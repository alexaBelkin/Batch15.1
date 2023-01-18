package MentorinfwithBohdan;

import java.util.Arrays;
import java.util.Scanner;

public class DublicateBegAndEnd {
    public static void main(String[] args) {


        System.out.println("Enter a string value");
        String str = new Scanner(System.in).next();
        // Check if the variable str has mirror edges.
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed+=""+str.charAt(i);
        }

        String busket="";

        for(int i=0;i<str.length();i++){
            for(int k=str.length()-1;k>=0;k--) {
                //if () {
                    busket+=""+str.charAt(i);


                }
            }System.out.println(busket);
        }
    }

