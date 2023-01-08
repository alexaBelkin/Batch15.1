package Loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //"***" for ten times with while
        int num=1,last=10;
        while(num<=last){
            System.out.println("***");
            num++;
        }

        //"***" for ten times with do while loop
        num=1;last=10;
        do{
            System.out.println("$$$");
            num++;
        }while(num<=last); // if we put (num>=last) we will see result as $$$ because of DO WHILE

        int x=5, y=20;
        do{
            System.out.println("Hello, its DO WHILE");
            y--;
        }while(y>x);

        //=========
        do{
            System.out.println("Hello, its DO WHILE-2");
            y--;
        }while(y>x);



    }
}
