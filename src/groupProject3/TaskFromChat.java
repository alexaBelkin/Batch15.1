package groupProject3;

import java.util.Scanner;

public class TaskFromChat {
    public static void main(String[] args) {
        //1. Take three numbers from the user and print the greatest number.
        //		Test Data
        //		Input the 1st number: 25
        //		Input the 2nd number: 78
        //		Input the 3rd number: 87
        //		Expected Output :
        //		The greatest: 87

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter 1st number:");
        int number1=sc.nextInt();
        System.out.println("please enter 2nd number:");
        int number2=sc.nextInt();
        System.out.println("please enter 3rd number:");
        int number3=sc.nextInt();
        int result= (number1>number2 ? number1:number2)>number3?(number1>number2 ? number1:number2):number3;
        System.out.println("The greatest:"+result);






    }
}
