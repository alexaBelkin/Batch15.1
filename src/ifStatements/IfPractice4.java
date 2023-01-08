package ifStatements;

import java.util.Scanner;

public class IfPractice4 {
    public static void main(String[] args) {
        // there are 3 tests for a class:
        // -to get letter score for averages
        //- use the folowing scale : 90-100(A) 80-90(B) 70-80(C) 60-70(D) less than 60--> please come again

        Scanner input=new Scanner(System.in);
        System.out.println("What is your score for test1?");
        int test1=input.nextInt();
        System.out.println("What is your score for test2?");
        int test2=input.nextInt();
        System.out.println("What is your score for test3?");
        int test3=input.nextInt();
        int testAv=(test1+test2+test3)/3;


        if (testAv>=90&& testAv<=100){
            System.out.println("You are A ");
        }else if(testAv>=80&&testAv<+89){
            System.out.println("You are B");
        } else if (testAv>=70&&testAv<=79) {
            System.out.println("You are C");
        }else if (testAv>=60&&testAv<=69){
            System.out.println("You are D");
        }else{
            System.out.println("Please come again!");

        }
    }
}
