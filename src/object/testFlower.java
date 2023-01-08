package object;

public class testFlower {
    public static void main(String[] args) {
        Flower f1=new Flower();

        Flower f2=new Flower("Daisy");
        System.out.println(f1.type);
        f1.type="Tulip";
        System.out.println(f1.type);
        System.out.println(f2.type);
        Flower f3=new Flower("rose","red");
        System.out.println(f3.color);




    }
}
