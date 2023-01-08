package primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {
        int number=675;
        System.out.println("number is "+number);
        int digit1=number%10;
        System.out.println("number is "+ digit1);
        number= number/10;
        System.out.println("number is "+ number);
        int digit2= number%10;
        System.out.println("number is "+ digit2);
        number=number/10;
        System.out.println("number is "+ number);
        int sum= digit1+ digit2 +number;
        System.out.println("The sum is "+sum);


    }
}
