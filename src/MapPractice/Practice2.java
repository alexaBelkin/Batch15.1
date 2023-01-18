package MapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(10,"Alex");
        map.put(20,"Sam");
        map.put(30,"Tom");
        System.out.println(map);
        System.out.println(map.get(30));
        map.put(20,"Vitaly");//if a key is existing on the map the value will updated/reasigned
        System.out.println(map);
        map.put(40,"natalie");
        map.put(50,"natalie");
        System.out.println(map);
        //how to reach out values individually
        //keySet(); it will return all keys from the map
        map.keySet();
        Set<Integer> keys=map.keySet();
        System.out.println(keys);
        for(int key:keys){
            System.out.println(map.get(key));
        }
        System.out.println("+++++++++++++++");
        //reach out values
        //values()
        Collection<String> values=map.values();//Collection is just return type
        System.out.println(values);
        for (String value:values){
            System.out.println("*"+value+"*");
        }
        //replace();
        map.replace(40,"XXXX");
        System.out.println(map);
        map.replace(50,"natalie","Jeremy");
        System.out.println(map);
        System.out.println(map.size());
        //cointainsKey()//containsVAlue()
        map.containsKey(10);
        System.out.println(map.containsKey(10));// return type is boolean
        System.out.println(map.containsKey(Integer.parseInt("10")));
        //isEmpty
        System.out.println(map.isEmpty());
        //clear
        map.clear();
        System.out.println(map.isEmpty());








    }
}
