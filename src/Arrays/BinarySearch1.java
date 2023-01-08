package Arrays;

import java.util.Arrays;

public class BinarySearch1 {
    public static void main(String[] args) {


        //binary search
        //---> array has to be sorted before applaying binary search
        //String[] drinks={"tea","cofee","coke","water"}
        //Arrays.binarysearch(drinks,   "water")-->position of the element
        String[] drinks = {"tea", "coffee", "coke", "water"};

        Arrays.sort(drinks);
        System.out.println(Arrays.binarySearch(drinks,"water"));
        System.out.println("=========");
        int[] numbers={3,6,8,8,2,11};
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers,8));
        System.out.println(Arrays.toString(drinks));
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers,2,5,8));

        //String[][] items={{"APPLE","DELL","ACER","SAMSUNG"},{"LG","SONY","TOSHIBA"},{"GOOGLE","BOSE","JBL"}};
        //Arrays.sort(items);
        //System.out.println(Arrays.deepToString(items));// won't work



    }
}
