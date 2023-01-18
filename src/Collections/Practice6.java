package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {
        //Every ArrayList is a List
        //but not every List is an ArrayList

        List<String> list1=new ArrayList(); //data type is not necessary

        list1.add("IL");
        list1.add("OH");
        System.out.println(list1.get(1));

        //convert from array to ArrayList
        int[] digits={3,4,5,6};
       // List<int[]> a =Arrays.asList(digits);// with data type
        List<int[]> a =Arrays.asList(digits);

        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        numbers.get(0);

       // a.add(12); UnsupportedOperration
        System.out.println(a);
        System.out.println(Arrays.toString(a.get(0)));//to show elements of array
        System.out.println(a.get(0)[0]);// element under indx 0

        //convert ArrayList to array
        ArrayList items=new ArrayList();
        items.add("Alexa");
        items.add("Anna");

        Object[] aray=items.toArray();// converitng from list to array
        System.out.println(Arrays.toString(aray));
        aray[1]="Vasya";
        System.out.println(Arrays.toString(aray));




    }
}
