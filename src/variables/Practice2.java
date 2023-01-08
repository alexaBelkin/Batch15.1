package variables;

public class Practice2 {

    public static void main(String[] args){

        //dataType name= value;--> full syntax to create a new variable
        // you cannot use java reserved words as variable name

        int apple = 10; // Declaring and initializing variable
        int number; // --> declaring variable(for a variable, deciding data tyoe and giving reference name)

        //System.out.println(number); // compile error since number does not have vallue

        number = 10; //--> Initializing variable (assigning value to the variable)
        System.out.println(number);

        System.out.println(number +5);  //shows 15
        System.out.println("number"+5); // shows number5

        number=20; //reassigning(changing value to variable)

        System.out.println(number);
        System.out.println(number *2);








    }



}
