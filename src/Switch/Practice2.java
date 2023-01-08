package Switch;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        // get an int number from user if number is 1--> "its IT department"
        // if number is 2--> "Its HR deparment"
        // 3--> its help desk
        //4---> its accounting
        //cover for invalid choices as well

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number:");
        int number=sc.nextInt();

        switch (number){
            case 1:
                System.out.println("It is IT deparment!");
                break;
            case 2:
                System.out.println("It is HR deparment!");
                break;
            case 3:
                System.out.println("Its help desk!");
                break;
            case 4:
                System.out.println("It is accaunting!");
                break;
            default:
                System.out.println("Invalid number");

        }



    }
}
