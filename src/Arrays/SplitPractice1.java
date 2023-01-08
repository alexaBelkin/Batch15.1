package Arrays;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {

        String str1="Selenium";
       String[]parts= str1.split("n");
        System.out.println(Arrays.toString(parts));
        //csv files
        String word="Today is sunny day";
        String[] parts2=word.split(" ");
        System.out.println(Arrays.toString(parts2));

        String str2="It is a good day to practice java.It is snowing outside.";
        str2=str2.replace("."," ");
        // store every word in array
        String[] parts3=str2.split(" ");
        System.out.println(Arrays.toString(parts3));
        // String[] items={"it","is"........}


        }

    }

