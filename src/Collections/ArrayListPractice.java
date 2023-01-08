package Collections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList();
        ArrayList list2=new ArrayList(3);
        ArrayList list3=new ArrayList(list1);

        ArrayList <String> list=new ArrayList<>(); //data type inside of diamond brackets
        System.out.println(list);
        list.add("tomatoes");//inSortion(sequence) order
        System.out.println(list);
        list.add("cucumber");
        list.add("potatoes");
        list.add("cherries");
        list.add("lettuce");
        System.out.println(list);
        System.out.println(list.get(4));
        String item=list.get(3);
        System.out.println(item);
        list.add(3,"bananas");//its not deleting its just adding the element to called index
        System.out.println(list);
        //list.add(9,"apples");//IndexOutOfBoundsException
        list.add(6,"apples");
        System.out.println(list);
        //add()an element,add() an element to a specific index,get()

        //size-->its like length(size of my list)
       int size= list.size();
        System.out.println(size);
        //set()--> its like replace methode
        list.set(4,"Dressing");
        System.out.println(list);
        //
        list.remove(4);//will remove the index from array and size will shrink
        list.remove("bananas");//removing by object name
        System.out.println(list);
        list.clear();
        System.out.println(list);
        //
        list.addAll(list1);
        ArrayList<String> list5=new ArrayList<>();
        list5.add("bread");
        list5.add("cheese");
        list5.add("mayo");
        list.addAll(list5);
        System.out.println(list);




    }

}
