package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice4 {
    /*
    create a methode that will take a map
    this method will add message to each key as follows
    "....is the best key"
     */

    public static void test2(Map<String,String> players){

        for (String hero:players.keySet()){
            System.out.println(hero+ "....is the best key");
            System.out.println(players.get(hero));//getting values
        }

    }

    public static void main(String[] args) {
        HashMap<String,String> map1=new HashMap();
        System.out.println(map1);//{}
        map1.put("Alex","7");
        map1.put("David","6");
        map1.put("Messy","10");
        map1.put("mbpe","12");
        test2(map1);



    }
}
