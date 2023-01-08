package object;

public class Phone {
    String shape;
    String color;
    double price;
    boolean cover;

    public void call(long phoneNumber){
        System.out.println("I am calling >>> "+phoneNumber);
  }
  public Phone(String shape,String color,double price,boolean cover){

        //constructor
      this.shape=shape;
      this.color=color;
      this.price=price;
      this.cover=cover;


  }

}
