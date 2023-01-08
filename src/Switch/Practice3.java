package Switch;

import java.util.Locale;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your favorite fruit?");
        /*
        ask user for their favorite food
        -strawberry,mango,apple,grape,banana
        "We have your favorite fruit..."
        "Sorry!We don't have your favorite...

         */
        String fruit=sc.nextLine().toLowerCase();
        switch (fruit){
            case "strawberry":
            case "grape":
            case "apple":
            case "mango":
            case "banana":
                System.out.println("We have your favorite fruit "+fruit);
                break;
            default:
                System.out.println("Sorry!We don't have your favorite "+fruit);

        }
    }
}
