package stringBuilder;

public class Practice1 {


    public static String alphabet(){
        String s="";
        for(char c='A';c<='Z';c++){
            s+=c;
            System.out.println(s);
        }
        return s;

    }

    public static void main(String[] args) {
        //create a program to print uppercase alpahbet as a single String
        alphabet();
        String str=alphabet();
        System.out.println(str.charAt(5));
        StringBuilder builder=new StringBuilder("Sunny");
        System.out.println(builder);
        StringBuilder builder1=new StringBuilder();
        builder1.append("Winter");
        System.out.println(builder1);
        builder1.append(" Is not having snow for this year");
        builder1=builder1.append("Is not having snow for this year");
        System.out.println(builder1);
        //use StringBuilder to print out lowercase alpabet

        StringBuilder alphabet1=new StringBuilder();
        for(char letter='a';letter<='z';letter++){
            alphabet1.append(letter);
            System.out.println(alphabet1);
        }







    }
}
