package variables;

public class Practice1 {

    public static void main(String[] args){

        //i want to add numbers 3 5 2 and show the total in the console

        System.out.println(3+5+2);

        //variables

        int redApples = 3;
        int greenApples = 5;
        int yellowApples = 2;
        //number of red apples is 3

        System.out.println("Number of red apples is "+ redApples);

        //create a variable and name it as total
        //get a value for this total variables by adding apples together
        //print out the total in a sentence --> total number of apples is ....

        int total = redApples + greenApples + yellowApples;

        System.out.println("Total number of apples is " + total);

        //create variables for prices of each apple type
        //red-> 2 green->3 yellows->4
        // create variables for total cost
        // show that how much we need to pay for all together

        int redApple1 = 2;
        int greenApple1 = 3;
        int yellowApple1 = 4;

        int totalPay = redApple1*redApples + greenApple1*greenApples + yellowApple1*yellowApples;
        System.out.println("you need to pay "+ totalPay);


        int totalRed= redApple1 *redApples;
        int totalGreen= greenApple1* greenApples;
        int totalYellow= yellowApple1*yellowApples;

       int totalCoast = totalRed + totalGreen + totalYellow;

        System.out.println(totalCoast);











    }

}
