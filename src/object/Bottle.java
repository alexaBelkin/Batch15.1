package object;

public class Bottle {
    //* Create a Bottle class
    //	-double size
    //	-boolean isClean
    //	-double liquidAmount
    //-- create one argument constructor to intialize isClean variable
    //-- create one argument constructor to initalize size
    //-- create one usage method which takes double amount as parameter and it updates the liquidAmount
    public double size;
    public boolean isClean;
    public double liquidAmount;
    public Bottle(boolean isClean){
        this.isClean=isClean;
    }
    public Bottle(double size){
        this(true);
        this.size=size;
        System.out.println("Fiji");
    }
    public void liquidAmount(double drink ){
        liquidAmount-=drink;
    }
    public void Check(Bottle bottle){
        if(bottle.size>8){
            System.out.println("it is a large bottle");
        }else{
            System.out.println("It is small size");
        }
    }
    public String toString(){
        return "Size: "+size + " isClean: "+isClean+" liquidAmount "+ liquidAmount;
    }


}
