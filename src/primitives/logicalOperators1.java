package primitives;

public class logicalOperators1 {
    public static void main(String[] args) {
        //travel-->passport and ticker
        boolean passport=true;
        boolean ticket=true;
        boolean travel= passport&&ticket;
        System.out.println(travel);

        // party -->dreescCode and age
        boolean dress=true; boolean age=true;
        boolean canGo=dress&&age;
        System.out.println("you can go "+canGo);

        //there is an event for kids and teens if the age of child is between 12 and 16
        int kidAge=15;
        int LoweLimit=12, upperLimit=16;

       boolean happyPlay= kidAge>LoweLimit && kidAge<upperLimit;

        System.out.println(happyPlay);

        //parents want to come together for a family dinner but kids
        // who are age of 12 to 18 do not want to go with them
        // adults and younger kids together
        // you have 5 years old child

        int kids=5; int lowTeen=12; int uperTeen=18;
        boolean kidWithAddult= kids<=lowTeen || kids>=uperTeen;
        System.out.println(kidWithAddult);

        //OR || ---> cash or credit card
        boolean cash=false, card=true,buy;

        buy=cash||card;
        System.out.println("Buy "+buy);

        //travel >> a type of ID (passport or government ID), visa, ticket, need to have money,
        // money has to be more than 5000$

        boolean visa=true, ticket2=true, passport1=true, id=true;
        double moneyLimit=5000, myMoney=1000;
        boolean result1=passport1||id;
        boolean resultMoney=myMoney>moneyLimit;

        //boolean travelTurk=result1&&visa&&ticket2&&resultMoney;
        //System.out.println(travelTurk);
        boolean fly=(passport1||id)&&visa&&ticket2&&(myMoney>moneyLimit);
        System.out.println(fly);

        System.out.println(true||false&&false); // &&-operation goes first if we have ||


        System.out.println('B'+2==3*'C' || !true&&'C'<'B'/3);

        /*
1 logical negation (!)
2 arithmetical operators
3 relational operations
4 logical operators && ||
 */














    }
}
