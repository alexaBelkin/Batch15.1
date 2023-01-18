package Collections;

import object.Bottle;

import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        /*create an ArrayList and store some bottle objects and manipulate elements from
        the arrayList
         */
        ArrayList<Bottle> list=new ArrayList<>();
        Bottle b1=new Bottle(6);
        Bottle b2=new Bottle(16);
        Bottle b3=new Bottle(26);


        //b1.toSting();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println(list);
        System.out.println(list.get(0));
        //System.out.println(list.get(1).liquidAmount());
        //compare and find the differences between b1 and b2 sizes
        System.out.println((list.get(1).size)-(list.get(0).size));
        //check the list and see if any bottles size is more than 10 print "that the bottle is a large"



    }
}
