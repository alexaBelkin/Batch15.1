package wrapperClasses;

public class StringToPrimitive {
    public static void main(String[] args) {
        String str1="1234";
        String str2="5678";
        System.out.println(str1+str2);
        //parse
        int number=Integer.parseInt(str1);
        System.out.println(number);
        Short number3=Short.parseShort(str2);
        System.out.println(number+number3);
        String str3="abcd";
       // int i3=Integer.parseInt(str3);NumberFormatException

        //valueOf()-->convert primitives to String

        int number4=12;
        String numberAsString=String.valueOf(number4);
        System.out.println(numberAsString+10);
        boolean bl=true;
        String bolAsString=String.valueOf(bl);
        System.out.println(bolAsString.toLowerCase());



    }
}
