package MapPractice;

import java.util.HashMap;
import java.util.List;

public class practice1 {
    public static void main(String[] args) {

        //HashMap<String, List<String>> map= new HashMap<>();
        HashMap<String,String> map1=new HashMap();
        System.out.println(map1);//{}
        map1.put("Alex","Smith");
        map1.put("David","Brown");
        map1.put("Mary","White");

        System.out.println(map1);
        System.out.println(map1.get("David"));
        String valueDavid=map1.get("David");
        System.out.println(valueDavid);


    }
}
