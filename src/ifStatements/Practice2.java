package ifStatements;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        //get a single letter from user
        //when the letter from the user is 'M' or 'm'---> its Monday
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter single letter:");
        char letter=input.nextLine().charAt(0);


        if (letter=='M'|| letter=='m'){
            System.out.println("Its monday!");
        }
        if (letter=='T'||letter=='t'){
            System.out.println("Its Tuesday!");
        }
        if (letter=='W'||letter=='w'){
            System.out.println("Its Wednesday!");

            //cover the cases when the incoming letter is not one of the expected letter
        }
        if (letter!='M'&&letter!='m'&&letter!='T'&&letter!='t'&&letter!='W'&&letter!='w'){
            System.out.println("not expected letter");
        }
    }
}
