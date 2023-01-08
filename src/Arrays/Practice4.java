package Arrays;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        int[] numbers={4,3,5,6,72,6,8,45};
        System.out.println(numbers.length);//size or count of elements
        System.out.println(numbers[0]);// 4
        System.out.println(Arrays.toString(numbers));
        numbers[1]=88;

        //multiply each elemnet by 10 and print out result
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]*10);

        }
        //multiply numbers that are greater than 10 by 100 and print the result
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]>10) {
                System.out.println(numbers[i]*100);
            }


        }

    }
}
