package Arrays;

import java.util.Arrays;

public class Practice9 {
    public static void main(String[] args) {
        String[] brands={"Nike","Adidas","puma","New Balance","Reebok"};//alphabetically
        int[] numbers={4,3,5,6,72,6,8,45};
        //sort()-->from smaller to bigger
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(brands);
        System.out.println(Arrays.toString(brands));




    }
}
