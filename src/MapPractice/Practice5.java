package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {

    public static void main(String[] args) {
        /*
        String str="Soccer";
        count numbers of each letter from the given string
        bring it as a MAP
        S-1
        o-1
        c-2
        e-1
        r-1
       */
        String str="Soccer is the best sport";
        HashMap<String,Integer> busket=new HashMap<>();
        for(int i=0;i<str.length();i++){
            String str1=""+str.charAt(i);
            if(busket.containsKey(str1)){
                busket.put(str1,busket.get(str1)+1);
            }else{
            busket.put(str1+"",1);}
        }
        System.out.println(busket);

    }
}
