package primitives;

public class ComparisonOperators2 {
    public static void main(String[] args) {

        //there is an event if a person is 18 yo or older, s/he can attend the event

        int ageOfPerson=20; int requiredAge=18;
        boolean canAttend= ageOfPerson>=requiredAge;
        System.out.println(canAttend);// true

        boolean canAttend1= requiredAge<=ageOfPerson;
        System.out.println(canAttend1); // same way as previous code

        // kids, if the age of child is 12 yo or less that child can go to the event

        int kidsAge=15, requiredKidAge=12;
        boolean kidCanG0= kidsAge<=requiredKidAge;
        System.out.println("Can the kid attend?"+kidCanG0);
        //if hte age of child is 10, tey can not participate

        int childAge=10,requiredChildAge=10;
        boolean canChildAttend=childAge==requiredChildAge; // CAN NOT ATTEND
        System.out.println("This child can not attend when the age is 10>>"+canChildAttend);










    }
}
