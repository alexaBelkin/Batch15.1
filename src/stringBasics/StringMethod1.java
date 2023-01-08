package stringBasics;

public class StringMethod1 {
    public static void main(String[] args) {
        String str="Sunday";
       int number= str.length();
        System.out.println(number);

        //length(); it will count characters in given string and return it as int(number)
        str+=" is a rainy day"; // always count spaces CONCAT
        int number1=str.length();
        System.out.println(number1);

        //concat()
        str=str.concat(" and java is getting easy");
        System.out.println(str);

        // charAt(); it will return a single char from given position on a string
        str="re d$";
        char houseNumber=str.charAt(4);
        System.out.println(houseNumber);
        char symbol2=str.charAt(2);
        System.out.println(symbol2); // just a space
        //want to take last char from given string, but you dont know the number for last char
        int count=str.length();
        char lastChar=str.charAt(count-1);
        System.out.println(lastChar);
        System.out.println(str.charAt(str.length()-1));








    }
}
