package Arrays;

import java.util.Arrays;

public class MultidementionalPractice1 {
    public static void main(String[] args) {
        int[][] numbers=new int[4][3];
        numbers[0][0]=73;
        numbers[0][1]=81;
        System.out.println(Arrays.deepToString(numbers));
        //store 95 to the last third element
        numbers[2][2]=95;
        System.out.println(Arrays.deepToString(numbers));
        //store 100 to the last index
        numbers[3][2]=100;
        System.out.println(Arrays.deepToString(numbers));
        //make it dynamic index
        numbers[numbers.length-1][numbers[numbers.length-1].length-1]=10;
        System.out.println(Arrays.deepToString(numbers));
        //1000 to each number and print it out
        for(int i=0;i< numbers.length;i++){
            for(int k=0;k< numbers.length-1;k++){
                numbers[i][k]=numbers[i][k]*1000;

            }


        }System.out.println(Arrays.deepToString(numbers));


        }

    }

