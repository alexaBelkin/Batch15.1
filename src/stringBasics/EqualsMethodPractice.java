package stringBasics;

public class EqualsMethodPractice {
    public static void main(String[] args) {
        //equals();
        String name1="Dmitriy";
        String name2="Dmitriy";
        String name3=new String("Dmitriy");
        System.out.println(name1.equals(name2));// true
        System.out.println(name1==name2); //true
        System.out.println(name1.equals(name3)); // true
        System.out.println(name1==name3);//false
        System.out.println("--------");
        String name4=name3;
        System.out.println(name3==name4); //---> true

        String name6=name1;
        System.out.println(name6==name1); //true



    }
}
