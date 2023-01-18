package SetPractice;

import java.util.HashSet;
import java.util.Set;

public class Task {
    //create a method that will take String array as parametr and it will return values as a set collection
    //{"phone","clock","timer","cup","microphone"}
    public static Set<String> test1(String[] str){
        Set<String> list=new HashSet<>();
        for(String str1:str){
            list.add(str1);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] str1={"phone","clock","timer","cup","microphone"};
        test1(str1);
        System.out.println(test1(str1));
    }
}
