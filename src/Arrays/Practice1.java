package Arrays;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        //i will store 5 diff ages into one array

        int[] ages=new int[5];
        //hashcode is location your array in the memory (if you println(ages))
        System.out.println(Arrays.toString(ages)); //printing out array is that way
        ages[0]=25;ages[1]=9;ages[4]=89;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[1]);// if you want to see only one single number you don't have to use Arrays.toString
        //reassigning

        ages[0]=35;
        System.out.println(Arrays.toString(ages));
        System.out.println(ages[ages.length-1]);
        System.out.println(ages.length);// capacity of length



    }

}
