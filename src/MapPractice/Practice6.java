package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice6 {
    public static void main(String[] args) {
        HashMap<String,Integer> departments=new HashMap<>();
        departments.put("IT",204);
        departments.put("HR",305);
        departments.put("ADMIN",102);
        //keySet()---> returning all keys as set
        //value()-->retirning all values as collections
        System.out.println(departments.keySet());
        System.out.println(departments.values());
        System.out.println(departments);

        //entrySet() --->will return keys and values as pairs

        System.out.println(departments.entrySet());
        Set<Map.Entry<String,Integer>> pair=departments.entrySet();
        //reach out key value pairs individially
        for(Map.Entry<String,Integer> pairs:pair){
            System.out.println(pairs);
            System.out.println(pairs.getKey()+"-->its a key");
            System.out.println(pairs.getValue()+"--->its a value");

            //Collection--->values();
            //Set---->keySet();
            //<Map.Entry<>>-->entrySet();
        }




    }
}
