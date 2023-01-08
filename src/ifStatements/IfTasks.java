package ifStatements;

import java.util.Scanner;

public class IfTasks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter number from 1 to 5");
        int number=input.nextInt();

        if(number==1){
            System.out.println("1--->Monday");
        }
        if(number==2){
            System.out.println("2-->Tuesday");
        }
        if(number==3){
            System.out.println("3--->Wednesday");
        }
        if(number==4){
            System.out.println("4--->Tuesday");
        }
        if(number==5){
            System.out.println("5--->Friday");
        }
        if(number>5||number<1){
            System.out.println("there is no matching to your entry");
        }
    }
}
