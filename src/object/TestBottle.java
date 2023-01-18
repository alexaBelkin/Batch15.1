package object;

public class TestBottle {
    public static void main(String[] args) {
        Bottle b1=new Bottle(8);
        System.out.println(b1.liquidAmount);
        b1.liquidAmount(4);
        System.out.println(b1.liquidAmount);
        //create a method that will take bottle object as a parametr
        //this method will find out if the bottle's size is greter than 8oz or not
        //if its greater than 8-->"it is a large bottle"
        b1.Check(b1);
        b1.size=9;
        b1.Check(b1);
        Bottle b2=new Bottle(13);
        //System.out.println(b2.toSting());


       // System.out.println(b1.toSting());





    }
}
