package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ObjectArrayPractice {
    public static void main(String[] args) {

        String str=new String("Test");
        int num1=9;
        boolean bl1=true;
        double d1=9.8;
        Scanner scanner=new Scanner(System.in);

        Object[] objects={str,num1,bl1,d1,scanner};
        for(Object ex:objects){
            System.out.println(ex.toString().charAt(0));

        }


    }
}
