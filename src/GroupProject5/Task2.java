package GroupProject5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Using the scanner asks the user to input the min and max
number. Write a java code that will calculate the sum of
numbers between the range of min and max and those that
can only be divided by 3 and 11.
(min and max numbers are included)
Example:
0, 120 -> 33 + 66 + 99 = 198
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter min number");
        int num1= sc.nextInt();
        System.out.println("Please enter max number");
        int num2=sc.nextInt();
        int sum=0;
        for(;num1<num2;num1++){
            if(num1%3==0&&num1%11==0){
                sum+=num1;

            }

        }System.out.println(sum);
    }
}
