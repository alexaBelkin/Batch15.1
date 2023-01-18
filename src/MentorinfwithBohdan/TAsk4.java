package MentorinfwithBohdan;

import java.util.Arrays;

public class TAsk4 {
    public static void main(String[] args) {
        /*check if the second string build from the same letters as a first string
        * given String s1="mama";
        * Given String s2="amam";
        * */
        String s1="mama";
        String s2="amam";
        boolean result=false;

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                result=true;
            }else{result=false;}

        }
        if(result){
            System.out.println("Positive result");
        }else{
            System.out.println("negative result");
        }

    }
}
