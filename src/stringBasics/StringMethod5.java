package stringBasics;

public class StringMethod5 {
    public static void main(String[] args) {
        String str="wednesday";
        str=str.replace('e','*');
        System.out.println(str);

        str=str.replace("w" ,"123");
        System.out.println(str);

        String str2="    today is so   quite  ";// only spaces in the beginning and end
        String noSpaceString=str2.trim();
        System.out.println(noSpaceString);

        //method chaining
        int num=str2.trim().replace('t','T').substring(2,8).length();
        System.out.println(num);

        //String quote="   From Zero to HERO   ";
        /*replace zero with'one'
        make entire string as uppercase
        remove all spaces
        get a three letter substring from the end
        print out whatever you have left with
         */

        String quote="   From Zero to HERO   ";
        String answer=quote.replace("Zero","one").toUpperCase().trim().replace(" ","");
        String answer2=answer.substring(answer.length()-3);
        System.out.println(answer);
        System.out.println(answer2);

        System.out.println(quote.replace("Zero","one").toUpperCase().trim().replace(" ",""));




    }
}
