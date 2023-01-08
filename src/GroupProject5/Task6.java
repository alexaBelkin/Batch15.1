package GroupProject5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a sentence that is not separated");
        String word= sc.nextLine();
        String newWord="";
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                newWord+=" ";

            }newWord +=word.charAt(i);
        }
        System.out.println(newWord.trim());

    }
}
