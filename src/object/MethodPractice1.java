package object;

public class MethodPractice1 {
    //i will create a method that will add two integer numbers together and return sum
    public int sumCalculator(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Two int parameter method is running");
        return sum;

    }
    public int sumCalculator(int num1,int num2,int num3){
        int sum=num1+num2+num3;
        System.out.println("Three int parameter method is running");
        return sum;
    }
//overload sumCalculator method to find sum of numbers from given array
    public int sumCalculator(int[]array){
        int sum=0;
        for(int number:array){
            sum+=number;
        }
        return sum;
    }


    public static void main(String[] args) {
        MethodPractice1 object=new MethodPractice1();
        int result=object.sumCalculator(3,5);
        System.out.println(result);
        int result1=object.sumCalculator(3,34,11);
        System.out.println(result1);
        int[] arr={2,3,4};
        int result3=object.sumCalculator(arr);
        System.out.println(result3);
        System.out.println(object.sumCalculator(new int[]{3,4,5}));



    }

}
