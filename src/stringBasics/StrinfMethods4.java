package stringBasics;

import java.util.Scanner;

public class StrinfMethods4 {
    public static void main(String[] args) {
        String season="Winter";
        //substring(); --> returns string

        String part = season.substring(1);
        System.out.println(part);

        String part2= season.substring(1,4);
        System.out.println(part2);

        //String task="Lets do it";
        //take and print out the word 'do' only from above string
        //System.out.println(task.substring(5,7));


        //make above task solution dynamic

        Scanner input=new Scanner(System.in);
        System.out.println("create 3 random words:");
        String words=input.nextLine();
        int space1=words.indexOf(" "); int space2=words.indexOf(" ",words.indexOf(" ")+1);
        String w = words.substring(space1+1,space2);
        System.out.println(w);








    }
}
