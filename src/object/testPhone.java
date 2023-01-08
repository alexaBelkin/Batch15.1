package object;

import java.util.Scanner;

public class testPhone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What shape of phone are you looking for?");
        String answer=sc.next();
        Phone phone1=new Phone(answer,"pink",999.99,true);
        System.out.println(phone1.color);
        System.out.println("square".equalsIgnoreCase(phone1.shape));
        phone1.call(7735108588L);
        //create a method to check price of phone
        //if the price is under my budget i will buy

        double budget=1000;
        System.out.println(budget> phone1.price?"I will buy":"You don't have enough money");
        checkPrice(phone1,1700);
    }

    public static void checkPrice(Phone phone,double limit){
        if(phone.price<limit){
            System.out.println("this is in your budget");
        }

    }
}
