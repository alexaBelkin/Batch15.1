package primitives;

public class TaskPractice {
    public static void main(String[] args) {

        //you need to have overage of 60 to pass a class
        // -when you get 3 tests
        //-our range for test scores is 0 to 100
        //AND you need to have 90 percent attendance

        int test1, average,test2,test3, requiredAv=60, requiredAtt=90, myAttendance=100;
        test1=50; test2=100; test3=80;
        average= (test1+test2+test3)/3; // average score
        boolean result=average>= requiredAv&&myAttendance>=requiredAtt;
        System.out.println(result);










    }
}
