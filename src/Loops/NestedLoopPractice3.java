package Loops;

public class NestedLoopPractice3 {
    public static void main(String[] args) {

        /*
        print out following message
        by using switch statements print names of each month next to number
        2020-->1,2,3...12
        2021-->1,2,3...12
        2022--> same thing
         */
        for(int year=2020;year<=2022;year++){
            System.out.print(year+"-->");
            for(int month=1;month<=12;month++){
                switch (month){
                    case 1:System.out.println(month+"-JAN,");
                    for (int day=1;day<=30;day++){
                        System.out.print(day+"*");
                    }break;
                    case 2:
                        System.out.print(month+"-FEB,");break;
                    case 3:
                        System.out.print(month+"-MAR,");break;
                    case 4:
                        System.out.print(month+"-APR ");break;
                    case 5:
                        System.out.print(month+"-MAY ");break;
                    case 6:
                        System.out.print(month+"-JUNE ");break;
                    case 7:
                        System.out.print(month+"-JULY ");break;
                    case 8:
                        System.out.print(month+"-AUG ");break;
                    case 9:
                        System.out.print(month+"-SEP ");break;
                    case 10:
                        System.out.print(month+"-OCT ");break;
                    case 11:
                        System.out.print(month+"-NOV ");break;
                    case 12:
                        System.out.print(month+"-DEC");break;


                }


            }
            System.out.println();

        }
    }
}
