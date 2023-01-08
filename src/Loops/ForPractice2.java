package Loops;

public class ForPractice2 {
    public static void main(String[] args) {
        //find the sum of numbers between 10 and 15 by using for loop
        int num1 = 10, num2 = 15, sum = 0;
        for (; num1 <= num2; num1++) {
            sum += num1;
        }
        System.out.println(sum);

        //String str="Today is beautiful";
        //print out every letter from this given string separeted by comma

        String str = "Today is beautiful";
        for (int ind = 0; ind < str.length(); ind++) {
            if (ind == str.length()-1) {
                System.out.print(str.charAt(ind));
            }else {
                System.out.print(str.charAt(ind) + ",");}


            //print above style without spaces--get rid of spaces and print letters with dashes




            }
        System.out.println("=======");
        String str1 = "Today is beautiful";
        str1=str.replace(" ","");
        for(int i=0;i<str1.length();i++){
            if(i==str1.length()-1){
                System.out.print(str1.charAt(i));
            }else{
                System.out.print(str1.charAt(i)+"_");
            }
        }

    }
}

