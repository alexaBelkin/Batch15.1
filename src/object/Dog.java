package object;

public class Dog {
    //instance variables define object

    static String name;
    int age;
    String breed="husky";
    static int food=20;

    public static void bath(){
        System.out.println("getting clean");
    }

    public String speak(int numberOfWords){
        System.out.println("The dog is speaking "+ numberOfWords+" words" );
        setAge(numberOfWords);

        return "Here are the words "+ numberOfWords;
    }
    public void play(){
        System.out.println("Dog is playing");
        food-=1;
    }

    public void feed(String foodType,int foodAmount){

        //if the food type is x cost for each pound is .50
        //if the food type is y cost for each pound is .10

        if(foodType.equalsIgnoreCase("x")){
            double number=.50*foodAmount;
        }else{
            double number=.10*foodAmount;
        }

        System.out.println("Dog is getting food");
    }
    public void setAge(int age1){
        age=age1;
    }

    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="Sharik";
        System.out.println(dog1.breed);
        System.out.println(dog1.age);
        dog1.setAge(1);
        System.out.println(dog1.age);
        Dog dog2=new Dog();
        System.out.println(dog2.age);
        String str=dog2.speak(7);
        System.out.println(str);
        System.out.println(dog1.food);//20
        dog1.play();
        dog1.play();
        System.out.println(dog1.food);//18
        System.out.println(dog2.food);
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        dog2.play();
        System.out.println(dog2.food);
        System.out.println("Dog1 name is "+dog1.name);
        System.out.println("Dog2 name is "+dog2.name);
        dog2.name="Persik";
        System.out.println(dog2.name);
        bath();


    }

}
