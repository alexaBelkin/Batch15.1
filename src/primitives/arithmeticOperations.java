package primitives;

public class arithmeticOperations {
    public static void main(String[] args) {

        // addition >> +

        int num1= 10, num2= num1 +5;

        int result1= num1 + num2;

        System.out.println(result1);

        // substraction >> -
        double result2 = num2-num1;
        System.out.println(result2); // 5.0

        int result3= 7-3;
        System.out.println(result3);

        //multiplacation >> *

        int count1=2;
        int count2=5;

        System.out.println(count1*count2);

        int result4= count1*count2;
        System.out.println(result4);//10

        System.out.println(result4 == (count1*count2)); //true
        System.out.println((result4 + 10 + result4) == (count1+count2));

        //division --> /

        int result5= count2/ count1;
        System.out.println(result5);

        double result6= count2/count1; //sinse count1 and count2 are created as int// result of division will be as int
        System.out.println(result6);

        double number1 = 11;
        double number2= 2;

        double divide= number1/number2;
        System.out.println(divide);


        // TASK: create a "farm class" and solve the folowong task in that class
        /* calculate number of the legs of the animals in this farm
         * show the result as "the total number of the legs in the farm is..
         */









    }
}
