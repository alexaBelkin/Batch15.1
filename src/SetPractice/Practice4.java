package SetPractice;

import java.util.*;

public class Practice4 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mac");
        list.add("mac");
        list.add("mac");
        list.add("Acer");
        list.add("lenovo");

        //find out duplicate elements from given list
        //use set in to your solution logic
        // add()
        HashSet<String> set=new HashSet<>();
        ArrayList<String> duplicates=new ArrayList<>();
        for(String item:list){
            if(!set.add(item)){
                System.out.println(item);
                duplicates.add(item);
            }
        }
        System.out.println("duplicates list>>>>"+ duplicates);




    }
}
