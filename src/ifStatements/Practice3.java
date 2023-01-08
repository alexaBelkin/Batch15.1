package ifStatements;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        //get the amount of purchase from user as Dollar amount,
        // when amount is 1000$---> give user 20% of discount and show final payment amount after discoint
        // less than 1000$--> give user 5% discount and show final payment amount after discount applied
        // if shopping is happening in the state of TX :charge 4.5% and add it to the final payment

        Scanner input=new Scanner(System.in);
        System.out.println("please enter purchase amount: ");
        double amount=input.nextDouble();
        double discount,total,discount1,total2; double tax=0;

        System.out.println("What state do you live?");
        Scanner stringScan=new Scanner(System.in);
        String inputState=stringScan.nextLine();

        if(inputState.equalsIgnoreCase("tx")||inputState.equalsIgnoreCase("texas")){
            tax=amount*0.045;
        }else{
            tax=amount*0.01;
        }

        if (amount>=1000){
            System.out.println("You will get 20% off!");

            discount=amount*(0.2);
            total=(amount-discount)+tax;
            System.out.println("Your savings is:"+ discount);

            System.out.println("You have to pay "+total+"$ with your 20% applied and "+tax+" taxes");

        }
        else {
            System.out.println("You will get 5% off!");
            discount1=amount*(0.05);
            total2=(amount-discount1)+tax;
            System.out.println("Your savings is:"+ discount1);
            System.out.println("You have to pay "+total2+"$ with your 5% applied and "+tax+ " taxes");

        }



    }
}
