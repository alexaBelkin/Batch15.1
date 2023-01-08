package Loops;

import java.util.Random;
import java.util.Scanner;

public class HeadTailTask {
    public static void main(String[] args) {
        /*
        I want to create a head/tail game (flipping coin) with java codes;
        -At the beginning print "Game is started, MAKE a GUESS! HEAD/TAIL " So, let user know that the game started.
            - get user's guess as HEAD/TAIL
            - compare user's guess with your random number 0/1 --> random.nextInt(2) <--
                - if guess is correct, print       ---> "You are lucky, it is your day today."
                - if the guess isn't correct, print  -> "Sorry, that was not the correct choice!"
            - at the end, ask user "Do you want to play again? Y/N "
                - if the answer is Y --> keep playing (this is your while condition!!!)
                - if the answer is N --> print --> "Its Ok, SEE you NEXT time!"
         */

        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        String answer2;

        do{
            System.out.println("Game is started,MAKE a GUESS!HEAD/TAIL");
            String userAnswer=sc.nextLine().toUpperCase();
            int number= random.nextInt(2);


            String answer=number==0? "HEAD":"TAIL";

            if (answer.equals(userAnswer)){
                System.out.println("You are lucky, it is your day today.");
            }else {
                System.out.println("Sorry, that was not the correct choice!");
            }
            System.out.println("Do you want to play again? Y/N");
            answer2=sc.nextLine();

        }while(answer2.equalsIgnoreCase("y"));
        System.out.println("Its Ok, SEE you NEXT time!");
    }
}
