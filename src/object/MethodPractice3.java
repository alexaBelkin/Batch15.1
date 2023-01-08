package object;

public class MethodPractice3 {
    //create a method that will take an array with some names of
    //veggies
    //this method will generate a message for each veggie as
    //"this is my most favorite"-->if veggie name has "green"
    //"this is my list favorite" -->if veggie name has NOT "green"
    //return count of eather favorite or non favorite veggie amount
    //make this method static

    public static int veggie(String[] veggies){
        int count=0;
        for(String name:veggies) {
            name.toLowerCase();

            if (name.contains("green")){
                System.out.println("this is my most favorite");
                count ++;

            }else{
                System.out.println("this is my list favorite");


            }
        }
        return count;
    }
    //overload veggie-method to create e-mail address for each veggie
    //return those created e-mail address as an array
    public static String[] veggie(String[] veggies,int number){
        String[] emails=new String[veggies.length];
        int index=0;
        for(String name:veggies){
            String email=name+ "gmail.com";
            emails[index]=email;
            index++;
        }
        return emails;

    }



}
