package groupProject2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        /*Using the scanner asks the user to enter one sentence with three words
and print the index number of each word's last character and then print
the sum of each index number that you found.
For Example:
Input:
"Importance of Human" --> it can be any three-word sentence.
 Output:
9 --> index number of 'e'
12 --> index number of 'f'
18 --> index number of 'n'
The sum: 39
Description
        */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 words sentence:");
        String sentence=input.nextLine();

        int space1=sentence.indexOf(" ");
        int space2=sentence.indexOf(" ",space1+1);
        int indexNum1=space1-1; int indexNum2=space2-1; int indexNum3=sentence.length()-1;
        System.out.println(indexNum1 + " index number of "+ sentence.charAt(space1-1));
        System.out.println(indexNum2+ " index number of "+ sentence.charAt(space2-1));
        System.out.println(indexNum3 + " index number of " + sentence.charAt(sentence.length()-1));
        int sumOfIndex= indexNum1+indexNum2+indexNum3;
        System.out.println(sumOfIndex);



    }
}
