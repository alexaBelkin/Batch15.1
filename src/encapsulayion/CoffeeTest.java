package encapsulayion;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        coffee.setSize(2.35);
        coffee.getSize();
        coffee.setType("Latte");
        coffee.getType();
        coffee.setHotOrIce(true);


    }
}
