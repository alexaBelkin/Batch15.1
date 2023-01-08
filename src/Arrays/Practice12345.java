package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Practice12345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter one string value");
        String str = sc.nextLine();

        str = str.trim().toLowerCase();
        String[] strAr=str.split("");
        //for(int k=0;k<str.length();k++){
        //                if(str.charAt(k)==str.charAt(k)){ //how to find same charS
        //                    extra=str.charAt(i);
        //                    System.out.println(extra);
        char extra;

        for (int i =str.length()-1; i >=0; i++) {
            for (int k = 0; k < strAr[i].length(); k++) {
                if (str.charAt(i) == strAr[i].charAt(k)) { //how to find same charS
                    extra = str.charAt(i);
                    String newChar =""+str.charAt(i);
                    System.out.println(extra);
                    strAr=str.split(newChar,2);
                    System.out.println(Arrays.toString(strAr));

                }

            }

        }


    }

        }






