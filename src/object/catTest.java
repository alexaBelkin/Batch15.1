package object;

public class catTest {
    public static void main(String[] args) {
        Cat tom=new Cat();
        tom.name="Tom";
        tom.age=3;
        tom.color="Black";
        System.out.println(tom.foodAmount);
        tom.foodAmount=40;
        System.out.println(tom.foodAmount);
        tom.Sleep();
        Cat cat2=new Cat();
        cat2.Sleep();// null is sleeping, because we didn't initialized new object
        int miles=tom.run(3);
        System.out.println(miles);
        //however many miles tom runs, give him 500 per mile
        System.out.println(tom.run(3)*500);
        String destination=tom.dest("chicago");
        System.out.println(destination);
        tom.setColor("Red");
        System.out.println(tom.color);
        System.out.println(cat2.color);//null
        tom.getColor();
        System.out.println(tom.getColor());
        System.out.println(tom.cats());
        tom.setAge(67);
        tom.getAge();
        System.out.println("in 10 years your age will be.."+(tom.getAge()+10)) ;








    }
}
