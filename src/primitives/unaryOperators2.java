package primitives;

public class unaryOperators2 {
    public static void main(String[] args) {

        double d= 8.7;
        d++;
        System.out.println(d);

        int a=5;
        int b=++a; // result is 6
        int c=a + ++b;

        System.out.println("c is " + c); // result is 13

        c=c++ + --a -2;
        System.out.println("c is now "+c); //16
        //
        int e=c+10;
        System.out.println(e);


        int k=8, t=++k, m= k+t, x=++m;
        System.out.println(--x - --k);
        // t=9  m=18 x= 19(-1 in mind) --->(18 -8)

        //===== deal on DD=====
        /*
        get one dozen of donuts $15 you get one dollar discount on your next purchase
        show your next purchase payment amount

        */

        int payment=15;
        System.out.println(payment--); //today
        System.out.println("next payment "+payment);

         /*
        get one dozen of donuts $15 you get one dollar discount on your payment now
        show your payment amount

        */
        int payment1=15;
        System.out.println(--payment1 + " $ payment now with applied discount");








    }
}
