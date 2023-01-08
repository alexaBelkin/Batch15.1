package ScannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //we will figure out initials of a person
        // John Deere--> Initials --> JD

        System.out.println("Please enter your first name");
        // to take string data, nextline() or next()

        char firstInitial=scanner.nextLine().charAt(0); // we are taking first letter
        System.out.println(firstInitial);

        System.out.println("Please enter your last name");
        char secondInitial=scanner.nextLine().charAt(0);
        System.out.println(secondInitial);

        //can we combine first and last initials
        System.out.println(""+firstInitial+secondInitial);







    }
}
