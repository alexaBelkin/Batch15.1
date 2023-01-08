package stringBasics;

public class StringMethods2 {
    public static void main(String[] args) {

        String str="phone";
        System.out.println(str.charAt(4));
       // System.out.println(str.charAt(5)); //StringIndexOutOfBoundsException
       // System.out.println(str.charAt(-3)); // won't work as well
        //System.out.println(str.charAt(str.length()));// won't work (str.length())->5, str.charAt(5)
        System.out.println(str.charAt(str.length()-2)); //--->charAt(3)


        // indexOf();
        System.out.println(str.indexOf('p')); //it will bring 0
        System.out.println(str.indexOf("p")); //it will bring 0
        System.out.println(str.indexOf("ph")); //-->if given chars will match first order it will bring first char index
        System.out.println(str.indexOf("ne")); //->3

        str="New York";
        //index number space
        System.out.println(str.indexOf(' ')); // 3

        str="mama";
        //finbd index of second 'a'
        System.out.println(str.indexOf('a',1));

        str="happy evening to you";
        System.out.println(str.indexOf('y')); //4
        System.out.println(str.indexOf('y',5));

        //how to pass index 5 above dynamically?

        int indexOfSecond=str.indexOf('y',str.indexOf('y')+1);
        System.out.println(indexOfSecond); //17

        String word="Java is getting easy:)";
        //find the second space's index number

        System.out.println(word.indexOf(' ',word.indexOf(' ')+1));

        String text="DO whatever it Takes";
        System.out.println(text.toLowerCase());//
        System.out.println(text.toUpperCase());
        System.out.println(text);

        String str2=text.toUpperCase();
        text=text.concat(str2).toUpperCase();
        System.out.println(text);


        // startWith();--> returns boolean
        //endsWith();-->return boolean








    }
}
