package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //create an array list and store 6 car brands and print out brand of every car from the list
        //[a,b,c,d,e,f]
        //a@yahoo.com

        ArrayList<String> brands=new ArrayList();
        brands.add("mercedes");
        brands.add("bmw");
        brands.add("mazda");
        brands.add("honda");
        brands.add("porshe");
        brands.add("volvo");
        Scanner sc=new Scanner(System.in);
        for(String brand:brands){
            System.out.println(brand+"@yahoo.com");
        }
        for(int i=0;i< brands.size(); i++){
            System.out.println(brands.get(i)+"@yahoo.com");
        }
        //create a methode that will take an arrayList as parametr
        //parametr arrayList should hold String tupe elements
        //that methode will show only elements which have letter 'a' in it

        methAr(brands);


    }

    public static void methAr(ArrayList<String> list){
        for (int i=0;i< list.size();i++) {
            if (list.get(i).contains("a")){
                System.out.println(list.get(i));
            }
        }
    }
}
