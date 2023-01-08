package Loops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        //printout hours and minutes as folows
        //for the hours from1 to 10
        //minutes from 0 to 59
        //hour-1:min-0
        for(int hour1=1,hour2=12;hour1<hour2;hour1++){

            for(int min1=0, min2=60;min1<min2;min1++){
                for(int sec=0;sec<60;sec++){
                    if (hour1<=6){
                    System.out.println("hour- "+hour1+": min- "+min1+": sec-"+sec+" AM");
                }else{
                        System.out.println("hour- "+hour1+": min- "+min1+": sec-"+sec+ " PM");
                    }
                }


            }

        }

    }
}
