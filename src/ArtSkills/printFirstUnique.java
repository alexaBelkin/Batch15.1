package ArtSkills;

import java.util.Arrays;
import java.util.Scanner;

public class printFirstUnique {
    public static void main(String[] args) {
        //Create the array size of 7 and store every number by asking user via scanner in the loop.
        //When asking user please use the text -> "Enter number for array" .
        //After having all numbers for array print ONLY the first unique value from this array.
        //If the array doesn't have any unique element print the text below
        //"Array doesn't have any unique element"

        Scanner sc=new Scanner(System.in);
        int[] numAr=new int[7];
        String str="";


        for(int i=0;i<numAr.length;i++){
            System.out.println("please enter int number:");
            numAr[i]=sc.nextInt();
        }




    }
}
