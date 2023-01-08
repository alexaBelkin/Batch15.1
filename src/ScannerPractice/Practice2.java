package ScannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("How is the weather this morning?");

        String  answer=input.nextLine();
        //System.out.println(answer);
        //ask user for the name of the day
        //store the name of the day
        //print a message as "So, It is a rainy Sunday"
        System.out.println("What day is today?");
        String answerDay=input.nextLine();
        System.out.println("So, it is a "+ answer+" " + answerDay);

        // NEXT Function next()--> will take a String till first space (for ex. NEW YORK(it doesn't show York part))
        System.out.println("Which city is this?");
        String city=input.next();
        System.out.println("So, it is a "+ answer+" " + answerDay+" in "+city);

        //aske user for the zipcode, store it and double check with user by printing back

        System.out.println("What is your zipcode?");
        int zipcode= input.nextInt();
        System.out.println(" Is your "+zipcode+ " right? ");









    }
}
