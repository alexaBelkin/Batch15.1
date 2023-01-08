package primitives;

public class RemindersPractoce3 {
    public static void main(String[] args) {

        int numberOfCars= 10;
        int numberOfPartners=3;

        //how many car each person will get
        int eachPerson =numberOfCars/numberOfPartners;
        System.out.println(eachPerson); //3


        //how many car/s will be leftover

        int leftOverCars =numberOfCars%numberOfPartners;
        System.out.println(leftOverCars);

        // tv , 465$---> each months---> 50$--->last month payment

        int tv, eachMonths, lastPay;
        tv=465;
        eachMonths=50;
        int monthPay=tv/eachMonths;
        System.out.println(monthPay);
        lastPay=(tv-(monthPay*eachMonths));
        System.out.println(lastPay);

        //int leftover=tv%eachMonths ---> i will get 15


        double tv2=465.50;
        double eachMonth2=50;
        System.out.println(tv2%eachMonth2);


        ////////////////
        //   int car=2;
        //   car=car+1; ---->3
        //   car+=1;

        //   int count=11;
        //   count=count+4;

        // int number=14;
        // number -=3;
        // int count=5;
        // number-=count;










    }
}
