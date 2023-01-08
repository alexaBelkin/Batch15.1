package ifStatements;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {
        //get a string from user
        //- check if the given string starts with letter'h' and the length of the string is more than 10
        //-print---> "this is what I am looking for

        Scanner input=new Scanner(System.in);
        System.out.println("Please give a word");
        String words=input.nextLine();

        if (words.startsWith("h")&&words.length()>10){
            System.out.println("this is what I am looking for");




        }


    }
}
