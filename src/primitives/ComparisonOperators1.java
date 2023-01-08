package primitives;

public class ComparisonOperators1 {
    public static void main(String[] args) {
        // ==

        int a=4, b=4;
        System.out.println(a==b); // ----> true

        boolean result1= a==a;
        System.out.println(result1); //---> true

        System.out.println(result1==true); //--->true

        boolean result2= ++a==2+3;
        System.out.println(result2);

        System.out.println(7==8);

        // != not eequal

        int num1=6, num2=6;
        boolean result3=num1!=num2;
        System.out.println(result3); //false

        System.out.println(num1!=2);//true

        char letter= '9';
        System.out.println(letter!= 9); //true

        char letter2= 'A';
        System.out.println(letter2!=65);// false
        System.out.println(letter2==65); // true

        System.out.println('t'!='T');// true

        //> greater than
        System.out.println(0 > 1); // false
        boolean result4= 0 > 1;
        System.out.println(result4); //false

        //System.out.println(result4> (9+10)); WON'T WORK BECAUSE RESULT4 IS FALSE

        System.out.println('A'>'a'); // false( ascii table)

        //< ---less than

        System.out.println(67<90);// true

        // >=greater than or eaqual to

        System.out.println(7>=7); //true

        int count=34;
        count +=count; // count= count+count
        int count2= count+count;
        boolean result6=count>=count2;
        System.out.println("result6 is "+ result6); //false

        // <= --- less or equals

        System.out.println(4<=8);//true
        System.out.println(6<=6); //true
        System.out.println(9<=2);// false
        System.out.println('a'<='b'); //true
        System.out.println("hi"== "bye"); //false
        System.out.println("hi"=="hi"); //true
        System.out.println("hi"!="hi" );
        //System.out.println("hi">"hi"); WONT WORK > < >=, <=

        int x='b';
        int y=x;
        System.out.println(x>y); //false












    }
}
