package Loops;

public class BreakPractice4 {
    public static void main(String[] args) {

        OUTER:
        for (int hour1 = 1, hour2 = 12; hour1 < hour2; hour1++) {
            INNER1:
            for (int min1 = 0, min2 = 60; min1 < min2; min1++) {
                if (min1==30) {break OUTER;}
                INNER2:
                for (int sec = 0; sec < 60; sec++) {
                    if(sec>20&&sec<40){
                        continue;
                    }

                    if (hour1 <= 6) {
                        System.out.println("hour- " + hour1 + ": min- " + min1 + ": sec-" + sec + " AM");
                    } else {
                        System.out.println("hour- " + hour1 + ": min- " + min1 + ": sec-" + sec + " PM");
                    }
                }

            }
        }
    }
}