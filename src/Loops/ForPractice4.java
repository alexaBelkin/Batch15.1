package Loops;

public class ForPractice4 {
    public static void main(String[] args) {
        //print out alphabet as uppercase letters


        for(char ch='A';ch<='Z';ch++) {
            System.out.println(ch);


        }

        //print out digits by separating them with $(0-9)

        for(char ch='0';ch<='9';ch++) {
            if(ch=='9'){
            System.out.println(ch);}
            else{
                System.out.print(ch+"-$$$-");
            }


        }
    }
}
