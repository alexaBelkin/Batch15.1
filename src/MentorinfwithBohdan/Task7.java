package MentorinfwithBohdan;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        //find all unique characters in a given String s="aabcdeeffd";
        //expected output :bc
        String s="aabcdeeffd";
        String s2="";
        String s3="";
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if (s.charAt(i)==s.charAt(j)&&i!=j){
                   s2+=s.charAt(i)+"";
                }
            }
        }for(int k=0;k<s.length();k++){
            if(!s2.contains(s.charAt(k)+"")){
                s3+=s.charAt(k)+"";
            }
        }
        System.out.println(s3);
    }
}
