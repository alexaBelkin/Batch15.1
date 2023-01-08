package object;

public class Animal {
    //instance variables(example)defines/belong the object
    String name;
    String color;
    int age;
    String gender="Female";
    int energy;


    public void eat(){

        System.out.println(name+ " is eating");
        energy=100;

    }
    public void printInfo(){
        System.out.println(name+"-"+age+"-"+color+"-"+gender);

    }

    public void runs(){
        energy-=20;
        System.out.println(name+" lose his energy and now have-> "+energy);


    }



}
