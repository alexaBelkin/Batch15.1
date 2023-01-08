package ifStatements;

import java.util.Scanner;

public class NestedIfPracticeTask {
    public static void main(String[] args) {
        //ask for city--> if city is Chicago, tell this person "What is your school name?"-->if the school is Techtorial
        //--> you are luck to have EFE!--> if school not techtorial--> please come and visit Techtorial
        // if the city is not chicago--> please come to chicago and visit us
        //if city name is Miami -->you should be attending miami campus!

        Scanner input=new Scanner(System.in);
        System.out.println("What is your city?");
        String city=input.nextLine();
        if (city.equalsIgnoreCase("Chicago")){
            System.out.println("What is your school name?");
            String school=input.nextLine();
            if (school.equalsIgnoreCase("Techtorial")){
                System.out.println("You are lucky to have EFE!");
            }else{
                System.out.println("Please come and visit Techtorial!");
            } }else if(city.equalsIgnoreCase("miami")) {
            System.out.println("you should be attending miami campus!");
            }
        else{
            System.out.println(" Please come and visit us!");
        }
    }
}
