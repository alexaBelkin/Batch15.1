package MentorinfwithBohdan;

import java.util.Scanner;

public class TaskWithLoop {
    public static void main(String[] args) {
        //take a word which contains letter 's','o','p' , get rid of it and print it out
        Scanner sc=new Scanner(System.in);
        System.out.println("sentence:");
        String str=sc.nextLine(); //hacker app

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='s'||str.charAt(i)=='o'||str.charAt(i)=='p') {
                str=str.replace(str.charAt(i)+"","");

            }
        }
        System.out.println(str);

    }
}
