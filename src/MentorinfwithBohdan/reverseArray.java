package MentorinfwithBohdan;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        // reverse array
        String[] arr5 = {"today", "is", "a", "sunny day"};
        String[] reverse = new String[arr5.length];
        int counter = -1;
        for (int i = arr5.length - 1; i >= 0; i--) {
            counter++;
            reverse[counter] = arr5[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}