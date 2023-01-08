package groupProject2;

public class Task3 {
    public static void main(String[] args) {
        //Please use method chaining for the following Strings. Methods are
        //provided next to the String.
        //String “ Snicker “; —> trim, toUpperCase, substring and charAt methods
        //String “Cookie” —> toLowerCase, replace ‘o’ with ‘u’, concat with ’s’,
        //starts with ‘C’

        String word1="Snicker"; String word2="Cookie";
        System.out.println(word1.trim());
        System.out.println(word1.toUpperCase());
        System.out.println(word1.substring(0,3)); /*substring is showing range of asked indexes for exp-->
        word "Apple";  if i ask for indexes (1,3) result is ----> ppl
        */
        System.out.println(word1.charAt(3)); // result is char belongs index3
        System.out.println("---------------");

        System.out.println(word2.toLowerCase());
        System.out.println(word2.replace('o','u')); // its replacing old char to a new char-->Cuukies
        System.out.println(word2.concat("s")); // by using concatenation we attached "s" ---> Cookies
        System.out.println(word2.startsWith("C")); // brings you boolean TRUE or FALSE













    }
}
