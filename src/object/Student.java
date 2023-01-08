package object;

import java.util.Random;

public class Student {
    int batchNumber;
    String firstName;
    String lastName;

    public void study(){
        System.out.println(firstName+" studies for "+hourCreator()+" hours");
    }
    public void sleep(){
        System.out.println(firstName+" sleeps for "+hourCreator()+" hours");
    }
    public int hourCreator(){
        Random random=new Random();
        int hour=random.nextInt(12);
        return hour;
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.study();
        student.firstName="Alex";
        student.study();
        student.sleep();
        //have a randon number
       int number= student.hourCreator();
        System.out.println(number);
    }
}
