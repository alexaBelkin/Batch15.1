package stringBuilder;

public class Practice2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append("January");
        Character ch=builder.charAt(0);
        System.out.println(ch);
        Integer i= builder.indexOf("y");
        System.out.println(i);
        String part= builder.substring(3);
        //put substring into a new string builder
        StringBuilder b2=new StringBuilder(builder.substring(3));


        builder.replace(1,4,"$$$");
        System.out.println(builder);
        builder=builder.replace(1,4,"**");
        System.out.println(builder);




    }
}
