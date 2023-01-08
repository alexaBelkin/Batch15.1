package object;

public class MethodPractice2 {
    //create a method that will take two double numbers and a operation name
    //this method will return result
    //*operation-->addation or multiplication
    public static void main(String[] args) {
        MethodPractice2 john=new MethodPractice2();
        double call1=john.test1(3.2,1.8,"multiply");
        System.out.println(call1);
        double call2=john.test1(4,4.5,"addition");
        System.out.println(call2);
        int age= john.age(2022,1995);
        System.out.println(age);



    }
    public double test1(double a, double b, String operationName) {
        double result=0.0;

        if (operationName.equalsIgnoreCase("multiply")) {
             result = a * b;

        } else if (operationName.equalsIgnoreCase("addition")) {
             result = a + b;;
        }
        return result;
    }
    //create a methid that will find out your age
    //return and print the age
    public int age(int year1,int birthYear){
        int age=year1-birthYear;
        System.out.println("Your age is: "+age);
        return age;
    }




}
