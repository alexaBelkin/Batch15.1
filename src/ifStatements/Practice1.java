package ifStatements;

public class Practice1 {
    public static void main(String[] args) {
        int money=100;
        int item$=250;

        System.out.println("First print before if statement");

        if(money>item$){
            System.out.println("you are buying the Item");


        }

        System.out.println("Another print AFTER if statement");
        int item2$=99;
        if(money>item2$){
            System.out.println("Im buying ITEM2");

        }

        //you have another option as using your credit card if the money is not enough

        boolean creditCard=true;
        if (money>item$||creditCard==true){
            System.out.println("you are using 2 different optionb to buy ITEM");
        }
        // Ask user to give you an integer number between 1 and 5
        //print out day name for related number



    }
}
