package ifStatements;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //figure out if a number is even or add number

        Scanner input=new Scanner(System.in);
        System.out.println(" please give a number ");
        int answer=input.nextInt();

        if (answer%2==0)
            System.out.println("even");
        else System.out.println("odd");





    }


}
