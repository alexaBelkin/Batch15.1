package object;

public class Animaltest {
    public static void main(String[] args) {
        Animal animal1=new Animal();
        //System.out.println(animal1);// object.Animal@5a39699c---> location of this object
        System.out.println(animal1.name);//default-->null
        System.out.println(animal1.age);
        System.out.println(animal1.color);//null
        animal1.name="Simba";
        System.out.println(animal1.name);
        animal1.color="pink";
        System.out.println(animal1.color);
        animal1.age=27;
        System.out.println(animal1.age);

        //create another object,
        // initialize all instance variables by using new object
        //print out those new values

        Animal cat=new Animal();
        System.out.println(cat.age);//0 by default
        cat.age=3;
        cat.name="Ginger";
        cat.color="orange";
        System.out.println(cat.age);
        System.out.println(cat.name);
        System.out.println(cat.color);

        System.out.println(cat.gender);
        System.out.println(animal1.gender);
        cat.gender="Male";
        System.out.println(cat.gender);

        System.out.println("==============");
        cat.eat();
        animal1.eat();
        //creat a method that will print out all properties of animals
        cat.printInfo();
        animal1.printInfo();
        System.out.println(cat.energy);
        Animal dog=new Animal();


        dog.eat();
        System.out.println(dog.energy);
        System.out.println(cat.energy);
        //create run method when an animal runs
        //he will loose energy 20 of energy

        cat.runs();
        System.out.println(cat.energy);


        //want to have a random number that i can add 1000 to it in this class
        Student student=new Student();
        int number= student.hourCreator();
        System.out.println(number+1000);


    }
}
