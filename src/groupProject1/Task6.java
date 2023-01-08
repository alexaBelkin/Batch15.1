package groupProject1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner inputMoney=new Scanner(System.in);
        //System.out.println("Please enter your money amount:");

        int penn=(int)(0.01*100);int nickl=(int)(0.05*100); int dime=(int)(0.10*100); int quarter=(int)(0.25*100);
        System.out.println("Please enter your money amount:");
        double moneyFromConsol=inputMoney.nextDouble();

        int amountIncents=(int)(moneyFromConsol*100);

        int quaterPart=amountIncents/quarter; ///how many quaters
        //System.out.println(quarterPart);
        int leftOver1=amountIncents%quarter;  //left over after quater count
        //System.out.println(leftOver1);
        int dimePart=leftOver1/dime;//how many dimes
        //System.out.println(dimePart);
        int leftOver2=leftOver1%dime;//leftover after dime count
        //System.out.println(leftOver2);
        int nicklPart=leftOver2/nickl; //how many nickels
        //System.out.println(nicklPart);
        int leftOver3=leftOver2%nickl;  // leftover after nickles count
        //System.out.println(leftOver3);
        int pennPart=leftOver3/penn;
        //System.out.println(pennPart);

        System.out.println("$"+moneyFromConsol+" will make "+ quaterPart +" quarters "+dimePart+ " dime "+ nicklPart+ " nickles and "+pennPart+" pennies" );


        

    }
}
