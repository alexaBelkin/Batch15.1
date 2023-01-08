package groupProject2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*Write the program to get the string value from the specified position.
First, ask the user to enter one String value. Then ask the user to the
enter starting number and ending number. After that, print the value
between the given starting and ending numbers. (Note: since the user
does not know the java, the user starts counting from 1, and the ending
number will be included)
Example:
Please enter the String value:
Definition of Science
Please enter the starting number:
2
Please enter the ending number
5
The output is:
efin
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the String value");
        String sentence=input.nextLine();
        System.out.println("Please enter the starting number:");
        int startNumber=input.nextInt();
        System.out.println("Please enter the ending number:");
        int endNumber=input.nextInt();

        String newWord=sentence.substring( +(startNumber-1),endNumber);
        System.out.println("The output is:");
        System.out.println(newWord);





    }
}
