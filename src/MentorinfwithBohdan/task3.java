package MentorinfwithBohdan;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        //given string reverse every word
        String str="hi people there";

        String[] str2=str.split(" ");
        String reversed="";

        System.out.println(Arrays.deepToString(str2));//

        for(int i=0;i<str2.length;i++){
            String s=str2[i];
           // System.out.println(s);
            reversed += " ";
            for(int k=s.length()-1;k>=0;k--){
                String a1=s.charAt(k)+"";
                reversed += a1;
            }
        }
       System.out.println(  reversed.trim());

    }
}
