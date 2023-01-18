package SetPractice;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {
        /*
        HashSet--> No order, can store null value
        LinkedHashSet-->Insertion order, can store null value
        TreeSet---->Ascending order,No null
         */
        HashSet<String> hash=new HashSet<>();
        LinkedHashSet<String> linked=new LinkedHashSet<>();
        TreeSet<String> tree=new TreeSet<>();
        hash.add("apple"); linked.add("apple"); tree.add("apple");
        hash.add("orange"); linked.add("orange"); tree.add("orange");
        hash.add("cherry"); linked.add("cherry"); tree.add("cherry");
        hash.add("strawberry"); linked.add("strawberry"); tree.add("strawberry");
        System.out.println(hash);System.out.println(linked);System.out.println(tree);
        hash.add(null); linked.add(null); //tree.add(null);
        System.out.println(hash);System.out.println(linked);System.out.println(tree);
        System.out.println(tree.first());//apple FIND FIRST ELEMENT FROM TREESET
        System.out.println(tree.last());// LAST ELEMENT FROM TREESET
        System.out.println(tree.pollFirst());//remove first
        System.out.println(tree.pollLast());//remove last
        System.out.println(tree);

        System.out.println(tree.descendingSet());// going back(from Z to A)
        System.out.println("adding watermelon first time "+tree.add("Watermelon"));// all the time will print true or falls
        System.out.println(tree);
        System.out.println(hash.contains("x"));//
        System.out.println("adding watermelon Second time--> "+tree.add("Watermelon"));//false





    }
}
