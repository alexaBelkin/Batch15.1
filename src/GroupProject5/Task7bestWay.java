package GroupProject5;

import java.util.Scanner;

public class Task7bestWay {
    public static void main(String[] args) {
        int sum=0;


        Scanner sc=new Scanner(System.in);
        for (int i=0;i<3;i++){
            System.out.println("Please enter int number:");
            int num=sc.nextInt();
            int multipleOften=num/10;
            if(num%10>=5){
                multipleOften++;
            }sum+=multipleOften*10;

            }
        System.out.println(sum);
            }
        }




