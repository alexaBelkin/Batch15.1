package MentorinfwithBohdan;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HowManyChars {
//    Count how many of each character in given String
//    To solve it use map
//    If given string “mama”
//    Expected output
//    m - 2
//    a -2

    public static void FrequencyTest(String  str ) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }


    public static void main(String[] args) {
        String s="AlezaBelkin";
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            String str=""+s.charAt(i);
            if(map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else{
                map.put(str,1);
            }
        }
        System.out.println(map);

        FrequencyTest(s);


    }

}
