package ifStatements;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know JAVA?");
        String answer1 = input.nextLine();
        if (answer1.equalsIgnoreCase("yes")) {
            System.out.println("Do you know Selenium?");
            String answer2 = input.nextLine();
            if (answer2.equalsIgnoreCase("yes")) {
                System.out.println("Well done! Do you know SQL?");
                String answer3 = input.nextLine();
                if (answer3.equalsIgnoreCase("yes")) {
                    System.out.println("Well done! Do you know API testing");
                    String answer4 = input.nextLine();
                } else {
                    System.out.println(" Please learn API testing");
                }
            }else{
                System.out.println("I am sorry, but we need someone who knows Selenium!");
            }
        } else {
            System.out.println("WE NEED SOMEONE WHO KNOWS JAVA!!!");
        }
    }
}



