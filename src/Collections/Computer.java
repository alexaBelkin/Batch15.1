package Collections;

import object.BankAccount;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

public class Computer {
    //Create a Computer class under ArrayList package
    // have instance fields of:brand, price,color,screenSize
    //Create one constructor to initialize all instance var
    /*
    /craeet test class
    /-store 4 computer objects an in arrayList
    show properties of each computer from the list
     */
    String brand;
    double price;
    String color;
    double screenSize;
    public Computer(String brand,double price,String color,double screenSize){
        this.brand=brand;
        this.price=price;
        this.color=color;
        this.screenSize=screenSize;
    }
    public static Double total(ArrayList<Computer> listAr){
        double busket=0;
        for(Computer device:listAr){
            busket+= device.price;
        }return busket;
    }
    public String toString(){
        return "Computer{"+ brand+" - " +price+" - "+color+" - "+ screenSize+" - ";
    }
    //craete a method that will get an arrayList as parametr
    //will find out computers that has price more than$1200
    //and screenSize more than 13.5
    //this method will store and reurn those comp as a new ArrayList

    public static ArrayList<Computer> findFancy(ArrayList<Computer> list2){
        ArrayList<Computer> result=new ArrayList<>();
        for(Computer item:list2){
            if(item.price>1200&&item.screenSize>13.5){
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Computer> list=new ArrayList<>();
        Computer i1=new Computer("iMac",1499,"white",26);
        Computer i2=new Computer("Samsung",399,"black",22);
        Computer i3=new Computer("Linex",1299,"white",10);
        Computer i4=new Computer("Asus",999.90,"green",23);
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        System.out.println(list);

        //find computers they are less than 1000
// and show their brand, cost and color
        for(Computer item:list){
            if(item.price<1000){
                System.out.println(item.brand+" "+item.price+ " "+item.color);
            }
        }
        for(int i=0;i< list.size();i++){
            if(list.get(i).price<1000){
                System.out.println(list.get(i).brand+" "+list.get(i).price+ " "+list.get(i).color);
            }

        }
        ArrayList<Computer> str=findFancy(list);
        System.out.println(str);
        double totalCost=total(list);
        System.out.println(totalCost);
        BankAccount account=new BankAccount();
        account.withdraw(totalCost);


    }

}
