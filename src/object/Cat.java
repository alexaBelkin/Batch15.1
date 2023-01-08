package object;

public class Cat {
    String name;//declared an instance variable
    String color;
    int age;
    int foodAmount=20;//declared and initialized an instance variable
    //create a method that will just print out "tom is sleeping
    // use this method in this test class
    public void Sleep(){
        System.out.println(name +"..is sleeping");
    }
    //creat run method that will return that is idicading how many miles user run


    public int run(int miles){
        System.out.println(name +" is running!");

        return miles;
    }
    //create method that will return String value -->"....tom.. is walking to ...destionation.."
    // destination should come from parametr

    public String dest(String destination){

        return name+" is walking to "+destination;
    }
    //create a methoid that will inisialized color of the cat
    public void setColor(String color1){
        color=color1;

    }
    //create a methed that will return color of cat
    public String getColor(){
        return color;
    }
    //create a method that will return all instance variables print and return
    public void insCat(){
        System.out.println(name+" "+color+" "+age+" "+foodAmount);

    }
    public String cats(){

        return name+color+age+foodAmount;
    }

    //set the ageOfCat and get age of cat by using method
    //once you used a method to get age of cet print out "in 10 years your age will be.."
    public void setAge(int age1){
        age=age1;
    }
    public int getAge(){

        return age;
    }

    }





