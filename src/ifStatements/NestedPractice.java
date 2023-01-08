package ifStatements;

public class NestedPractice {
    public static void main(String[] args) {
        //id visa ticket
        //check id -->check visa-->check ticket
        boolean id=true, visa=true,ticket=true;
        if (id){
            if(visa){
                if(ticket){
                    System.out.println("Enjoy your flight!");

                }else{
                    System.out.println("You should have ticket");
                }

            }else{
                System.out.println("You should have visa");
            }

        }else{
            System.out.println("First, you should have valid ID");
        }
    }
}
