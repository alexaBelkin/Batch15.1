package stringBasics;

import java.util.Scanner;

public class StringMethods3 {
    public static void main(String[] args) {

        String str="water";
        boolean result1=str.startsWith("w");
        System.out.println(result1);

        //endsWith(); return boolean
        System.out.println(str.endsWith("r"));

        /*TASK:get a string from User via scanner and:
        -print:
        -first char
        -last char
        -index of second matching letter 'c'
        -lenth of string
        -index of x
        middle char


        */
        Scanner input=new Scanner(System.in);
        System.out.println("random word:");
        String word=input.nextLine();
        System.out.println(word);
        System.out.println(word.charAt(0)); //-->u
        System.out.println(word.charAt(word.length()-1)); //--> r last letter
        System.out.println(word.indexOf('c',word.indexOf('c')+1)); //-1
        System.out.println(word.length()); //length
        System.out.println(word.indexOf('x')); //index of x
        System.out.println(word.charAt(word.length()/2));
        //.contains()----> boolean

        str="water";
        boolean b=str.contains("w");
        boolean b1=str.contains("ter");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(str.startsWith("wat")!=str.contains("ter"));//false

        //equals();
        System.out.println(str.equals("Water")); // false
        System.out.println(str.equals("WATER")); //false

        //equalsIgnoreCase(); -->returns boolean
        System.out.println(str.equalsIgnoreCase("WaTer"));// --> true
        System.out.println(str.equalsIgnoreCase("ater")); //--> false








    }
}
