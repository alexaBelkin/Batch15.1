package groupProject3;

import java.util.Scanner;

public class TaskFromChat3 {
    public static void main(String[] args) {

        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years. If employee has been working more than 10 years, company will give 10% bonus.
        //If Employee has more than 15 years, they will get 20% bonus.
        //Ask user for their salary and year of service and print the net bonus amount.

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your salary:");
        double salary=sc.nextDouble();
        System.out.println("Please enter your year of service:");
        int year=sc.nextInt();
        double bonus1=0.05,bonus2=0.1, bonus3=0.2,result1,result2,result3,bonusYear;

        if (year>=5&&year<10){
            result1=salary*bonus1;
            System.out.println("Thanks for your great job!For "+year+" year experience you will get "+result1+"$ bonus");
        }else if (year>=10&&year<15){
            result2=salary*bonus2;
            System.out.println("Thanks for your great job!For "+year+" year experience you will get "+result2+"$ bonus");
        } else if (year>=15) {
            result3=salary*bonus3;
            System.out.println("Thanks for your great job!For "+year+" year experience you will get "+result3+"$ bonus");
        }else {
            bonusYear=(int)5-year;
            System.out.println("Don't worry! You will get your bonus in "+bonusYear+" years!");
        }
    }
}
