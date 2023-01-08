package object;

public class TestDog {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.play();
        Dog.bath();//we called static method which belongs to the class
        dog.bath();


    }
}
