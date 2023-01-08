package groupProject2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*Using a scanner enter three different ingredients for the product on the
        same line. Then ask the user to enter any int number. Change the first
        letter of the ingredients starting from the entered number. (Ingredients
        should start with different letters. Please read the example carefully )
        Example 1:
        Please enter three ingredients with spaces:
        Milk Peanuts Butter
        Please enter the int number:
        5
        The output is:
        /5ilk 6eanuts 7utter
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 3 ingredients:");
        String words=input.nextLine();
        System.out.println("Please enter any number");
        int number=input.nextInt();
        //milk peanuts butter
        int space1=words.indexOf(" "); int space2=words.indexOf(" ",words.indexOf(" ")+1);
        String word1=words.substring(0,space1); // cut first word
        String word2=words.substring(space1+1,space2); // cut second word
        String word3=words.substring(space2+1); //cut third word

        int num1=number+1; int num2=num1+1;

        String newWord1= word1.replaceFirst(""+word1.charAt(0),"" +number);
        String newWord2=word2.replaceFirst(""+word2.charAt(0) ,""+num1);
        String newWord3=word3.replaceFirst(""+word3.charAt(0),""+num2);

        System.out.println("The output is : ");
        System.out.println(newWord1+" "+newWord2+" "+newWord3);




    }
}
