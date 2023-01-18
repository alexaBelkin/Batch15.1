package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        HashSet set1=new HashSet();
        HashSet<String> set2=new HashSet();
        HashSet<Integer> set3=new HashSet<>();
        Set<String> set4=new HashSet();

        System.out.println(set2);//show just []
        set2.add("Alexa");
        set2.add("Vitaly");
        set2.add("Sam");
        set2.add("Janifer");
        System.out.println(set2);//random elements/random indexing- NO ORDER
        set2.add("Sam");//won't add duplicate
        System.out.println(set2);
        //null
        set2.add(null);
        System.out.println(set2);
        //show all elements one by one
        //if the name is Alex "say hello to him"
        for(String s:set2) {
            if (s!=null&&s.equalsIgnoreCase("Alexa")) {
                System.out.println("Hello " +s);
            }
        }
       Boolean result= set2.contains("Alex");
        System.out.println(result);
        set2.isEmpty();
        set2.clear();
        System.out.println(set2);
        HashSet<String> test=new HashSet();
        test.add("Denver");
        test.add("Cleveland");
        test.add("La");
        test.add("columbus");

        filter(test);



//        HashSet<String[]> set6=new HashSet();
//        String[] strs={"a","b","a"};//even if array has the same elements Hashset allow you to get both array
//        String[] strs2={"a","b","a"};
//        set6.add(strs);
//        set6.add(strs2);





    }
    //create a method that will take Set parametr
    //this method will filter String elements based on their length
    //length 5 or more will have stars next to it
    //others will have ? next to it

    public static void filter(HashSet<String> param){
        for(String str:param){
            if(str.length()>5){
                System.out.println(str.concat("*"));
            }else{
                System.out.println(str.concat("?"));
            }
        }

    }
}
