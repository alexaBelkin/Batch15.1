package Loops;

public class ForPractice3 {
    public static void main(String[] args) {
        String str = "It is a cloudy day in Chicago";
        //print out >>"I found a lowercase 'c' when you see a lowercase 'c'
        // count how many 'c'
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c') {
                counter++;
                System.out.println("I found a lowercase 'c'");

            }if(str.charAt(i) == 'i'){
                System.out.println(str.charAt(i));
            }

            }System.out.println("I found "+counter+" lowercase 'c' in the string");
        //print out letter 'i' from the string

        }

    }
