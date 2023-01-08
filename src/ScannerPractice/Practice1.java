package ScannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        // i will print my first name
        String firstName="Alexa";
        System.out.println("My first name is "+ firstName);

        // I wan to get Lastname from user and print ---> "your Last name is...

        Scanner scanner= new Scanner(System.in);
        //scanner.nextLine();

        String LastName= scanner.nextLine();
        System.out.println(LastName);
        System.out.println("Your Last name is: "+LastName);

        //get name of the city from user and say"Alexa Belkin, you are living in ...
        String city=scanner.nextLine();
        System.out.println(city);
        System.out.println(firstName + LastName + ", you are living in "+ city);




    }
}
