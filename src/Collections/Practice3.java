package Collections;

import object.*;

import java.util.ArrayList;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<Integer> zipcodes=new ArrayList<>();
        zipcodes.add(540);
        zipcodes.add(600);
        zipcodes.add(404);
        zipcodes.add(202);
        System.out.println(zipcodes);
        for(Integer code:zipcodes){
            System.out.println(code+10);
        }
        for(Object code:zipcodes){
            System.out.println(code);
        }
        System.out.println("=======");
        ArrayList list1=new ArrayList();
        list1.add("Diana");
        list1.add(123);
        list1.add(true);
        System.out.println(list1.get(0).toString().toUpperCase());
        System.out.println(list1.get(1).toString().equals("123"));
        //contains
        System.out.println(zipcodes.contains(540));
        System.out.println(zipcodes.contains(100));
        Boolean b=zipcodes.isEmpty();
        System.out.println(b);
        list1.clear();
        System.out.println(list1.isEmpty());

        System.out.println(methAr(zipcodes));
        ArrayList mixed=new ArrayList();
        mixed.add(8);
        mixed.add("test");
        mixed.add(true);
        mixed.add(5.6);
        Cat cat=new Cat();// data type of this object is CAT
        mixed.add(cat);
        Flower flower=new Flower();
        Bottle bottle=new Bottle(4);
        mixed.add(bottle);

        System.out.println(mixed);



    }
    //create a methode that will create n ArrayList as param
    //it will generate mesagges for each item from the list
    //it will store and return those messages as an Arraylist
    public static ArrayList<String> methAr(ArrayList<Integer> list){
        ArrayList<String> messages=new ArrayList<>();
        for(Integer number:list){
            messages.add(number+" HI");
        }
        return messages;
    }

}
