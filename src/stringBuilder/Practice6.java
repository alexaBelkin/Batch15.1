package stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Practice6 {
    public static void main(String[] args) {

        StringBuilder builder=new StringBuilder("Welcome");
        builder.reverse();
        System.out.println(builder);

        //toString()

        String str=builder.toString();
        System.out.println(str);

        String[] words={"code","fish","interview","mock","is","coming","soon"};
        test4(words);

    }


    static public List<String> test4(String[] words){
        List <String> list=new ArrayList();
        String reversed="";
        for(String word:words){
            StringBuilder builder=new StringBuilder(word);
            list.add(builder.reverse().toString());
        }
        System.out.println(list);
        return list;

    }
}
