package GroupProject5;

import java.util.Arrays;
import java.util.Scanner;

public class FindUniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAr = new int[7];
        for (int i = 0; i < numAr.length; i++) {
            System.out.println("Enter number for array");
            numAr[i] = sc.nextInt();
        }
        boolean isThereUniqueInArray=false;
        for (int i = 0; i < numAr.length; i++) {
            int num=numAr[i];
            //we should check all the numbers in array except the number itself numAr[i]
            //if any number equal to numAr[i]
            //other than numAr[i] it means numAr[i} is not unique
            boolean isNumUnique=true;
            for(int j=0;j<numAr.length;j++){
                if (num == numAr[j]&&i!=j) {
                    isNumUnique=false;
                }
            }if(isNumUnique){
                System.out.println(num);
                isThereUniqueInArray=true;
                break;
            }
        }if(isThereUniqueInArray==false){
            System.out.println("Array doesn't have any unique number");
        }

    }
}






