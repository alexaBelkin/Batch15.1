package groupProject1;

public class Task4 {
    public static void main(String[] args) {
        int min, days, years;
        int totalDayHours = 1440;
        int totalDayYear = 365;

        min=3456789;
        days= min/totalDayHours;
        years= (days/totalDayYear);

        int leftoverDays= days%totalDayYear;

        System.out.println(min + " minutes is approximately "+ years +" years " + leftoverDays + " days");}


    }
