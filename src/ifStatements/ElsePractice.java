package ifStatements;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        int money=100;
        //if your money is more than $100 you can get an item
        if (money>100){
            System.out.println("I can buy an Item");

        }else{
            System.out.println("I can't afford it ");
        }

        money=101;
        if(money>100){
            System.out.println("I can buy");
        }else{
            System.out.println("I don't have enough money");
        }
        //ask user if they have drivers ID
        // if the answer is yes ---> you are great
        // if the answer is something else ---> DMV is at the next door please visit


        Scanner input=new Scanner(System.in);
        System.out.println(" Do you have driver's license");
        String answer=input.nextLine();

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("you are great");
        }else{
            System.out.println("DMV is at the next door please visit");
        }


    }
}
