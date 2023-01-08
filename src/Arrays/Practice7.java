package Arrays;

import java.util.Arrays;

public class Practice7 {
    public static void main(String[] args) {
        String[] brands={"Nike","Adidas","puma","New Balance","Reebook"};
        String[] reversedArray=new String[brands.length];
        //print every brand name in reverse version

        for(int i=0;i<brands.length;i++){
            String reversed="";
            for(int k=brands[i].length()-1;k>=0;k--){
                reversed+=brands[i].charAt(k);

            }
            reversedArray[i]=reversed;
            System.out.println("Revesed of: "+brands[i]+">>>"+reversed);

        }
        System.out.println(Arrays.toString(reversedArray));


    }
}
