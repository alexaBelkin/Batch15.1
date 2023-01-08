package ternary;

public class Practice1 {
    public static void main(String[] args) {
        // booleanCondition ? value1:value2;
        int a=16,b=7;
        int result= a<b ? a+b:a*b;
        System.out.println(result);// 13

        String result1=a!=b ? "Addition":"Multiplication";
        System.out.println(result1);
        System.out.println(a>=b+9 ?'c':"check"); // we can't store into a data type if we have different data result

        String str1="I am so lucky";
        String str2="It is going great";
        String day="Sunday";
        System.out.println(day.equals("Monday")?str2:str1);

        System.out.println(a>b?++a + ++b:--a+--b);

        System.out.println(day.equals("Monday")?str2:a>b?++a + ++b:--a+--b);




    }
}
