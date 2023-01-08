package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //ask user that how many chocolate names s/he wants to store in array
        //get the names of the chocolates from user
        //and store them into a array
        //lindor,milka,twix,ferrero,snickers,m&m -> if the name of chocolate longer than 5 or less store it in short names array
        //otherwise store it long names array


        Scanner sc = new Scanner(System.in);
        System.out.println("how many chocolate names s/he wants to store in array");
        int chocAmount=sc.nextInt();

        String[] big=new String[chocAmount];
        String[] small=new String[chocAmount];
        for(int i=0;i<chocAmount;i++){
            System.out.println("create a name for chocolates "+(i+1));
            String name=sc.next();
            if(name.length()>5){
                big[i]=name;

            }else{
                small[i]=name;

            }
            }
        System.out.println(Arrays.toString(big));
        System.out.println(Arrays.toString(small));


        }


    }

