package object;

import java.util.Scanner;

public class BankAccount {
    //* New Class: BankAccount
    //variables:
    //-accountHolderName, bankName, balance, userName, password, isLoggedIn
    //Methods:
    //- void displayInfo() ->will print out all account information
    //- double deposit() -> one pramameter to update balance
    //- double withdraw() -> one parameter to update balance
    //-void logIn() -> userName, password parameters to update isLoggedIn boolean.
    //create a method that will initialized instance fields
    //void signUp

    String accountHolderName;String bankName;double balance; String userName;
    String password; boolean isLoggedIn;

    public void displayInfo(){
        if(isLoggedIn==true){
            System.out.println("Account holder name "+accountHolderName+"\n Bank name "+bankName+"\nBalance "+balance+"\n Username "+userName+"\nPassword is "+password);

        }else{
            System.out.println("You should be logged in first to see all info");
        }
        }
    public double deposit(double moneyIn){
        balance+=moneyIn;
        System.out.println("Your balance after depositing "+moneyIn+">>> "+balance);
        return balance;
    }
    public double withdraw(double moneyOut){
        balance-=moneyOut;
        System.out.println("Your balance after withdrowing "+moneyOut+">>> "+balance);
        return balance;
    }
    public void logIn(String user,String pass){
        if(userName.equals(user)&&password.equals(pass)){
            isLoggedIn=true;
            System.out.println("You succesfully loged in ");
            displayInfo();

        }else{
            System.out.println("Wrong username or password ");
        }

    }
    public void signUp(String accHolder,String userName1,double money,String password1){
        accountHolderName=accHolder;
        userName=userName1;
        balance=money;
        password=password1;
        System.out.println("sign uo is done");



    }

}
