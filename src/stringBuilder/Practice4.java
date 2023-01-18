package stringBuilder;

import java.util.*;
import java.util.ArrayList;

public class Practice4 {
    //create a method that will take stringbuilder object
    //and this method will delete * from given parametr

    public void test(StringBuilder bld){
        for(int i=0;i<bld.length();i++){
            if(bld.charAt(i)=='*'){
                bld.deleteCharAt(i);
                i--;
            }
        }

    }

    //{"code","fish","interview","mock","is","coming","soon"}
    //replace every char I with '-'from given array

    public static void test2(StringBuilder[] blvdAr){
        for(StringBuilder word:blvdAr){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i)=='i'){
                    word.replace( word.indexOf(""+ word.charAt(i) ), word.indexOf(""+ word
                            .charAt(i) )+1, "-");

                }
            }
            System.out.println(word);
        }

    }

    //String[] words={"code","fish","interview","mock","is","coming","soon"};
    //return has list and words need to be reversed
    static public List <String> test4(String[] words){
      List <String> list=new ArrayList();
      String reversed="";
      for(String word:words){
          for(int i=word.length()-1;i>=0;i--){
              reversed+=""+word.charAt(i);
          }
          list.add(reversed);
      }
        System.out.println(list);
        return list;

    }



    public static void main(String[] args) {
        StringBuilder bld=new StringBuilder("t******he i*n*terv*iew *is *comi*ng");
        Practice4 obj=new Practice4();
        obj.test(bld);
        System.out.println(bld);
        String[] arr={"code","fish","interview","mock","is","coming","soon"};
        StringBuilder[] strBldAr={new StringBuilder("code"),new StringBuilder("fish"),new StringBuilder("interview"),new StringBuilder("mock")};
        test2(strBldAr);







    }
}
