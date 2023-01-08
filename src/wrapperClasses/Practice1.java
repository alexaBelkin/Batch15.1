package wrapperClasses;

public class Practice1 {
    public static void main(String[] args) {
        Byte b1=new Byte((byte)4);//we can use casting inside
        byte bt=4;
        Byte b2=6;//autoboxing
        Integer i1=11;
        Character letter='r';
        String str=letter.toString().concat("Testing");
        System.out.println(str);

        int a=i1;// unboxing--> converting from wrapper to Primitive data
        byte bt2=b1;// unboxing
        byte bt3=(byte)(b1+i1);//unboxing and casting






    }
}
