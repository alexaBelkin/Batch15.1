package Loops;

public class WhilePractice6 {
    public static void main(String[] args) {
        /*
        print out every letter from a given string by separating them with dash
        //television--->t-e-l-e-v-i-s-i-o-n
         */
        String word="television"; int index=0;
        while (index<=word.length()-1){
            if (index==word.length()-1){
                System.out.print(word.charAt(index++));
            }else {System.out.print(word.charAt(index++)+"-");

        }
    }
    }
}