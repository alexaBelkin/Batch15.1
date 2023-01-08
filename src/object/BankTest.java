package object;

public class BankTest {
    public static void main(String[] args) {
        BankAccount test=new BankAccount();
        test.displayInfo();
        test.signUp("Alexa","alexaBelkin",2345,"12345");

        test.deposit(10000);
        test.withdraw(500);

        test.logIn("alexaBelkin","12345");


        BankAccount java1=new BankAccount();
        System.out.println(java1.isLoggedIn);


    }
}
