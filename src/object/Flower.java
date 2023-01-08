package object;

public class Flower {

    String type;
    double price;
    String color;

    public void sell(){
        System.out.println("Selling a flower");
    }
    public Flower(){
        System.out.println("NO argument constructor");
    }
    public Flower(String type){
        this.type=type;
        System.out.println("ONE argument constructor");

    }
    public Flower(String type,String color){
        this.type=type;
        this.color=color;
        System.out.println("2 arguemnets constructor");

    }

}
