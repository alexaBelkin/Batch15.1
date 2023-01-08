package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitPractice2 {
    public static void main(String[] args) {
        String str="Sunday is daddy day";
        String[] parts1=str.split("d");
        System.out.println(Arrays.toString(parts1));// 6 elements
        String[] parts2=str.split("d",3);// limitation of cutting(limit 3)
        System.out.println(Arrays.toString(parts2));
        //12.23.2022
        //12/23/2022
        //12-23-2022
        String date="12-23-2022";
        String[] date1=date.split("-");
        if (date1[0].equals("12")&&date1[1].equals("23")){
            System.out.println("Happy birthday");
        }
        String date2="12.23.2022";
        //String[] date22=date2.split(".");// we will get an empty index box(we have to put 2 back slashes \\ in front of dot)
        String[] date22=date2.split("\\.");
        System.out.println(Arrays.toString(date22));




    }
}
