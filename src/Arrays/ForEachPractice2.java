package Arrays;

import java.util.Arrays;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] flowers={"daisy","rose","sunflower"};
        for(String flower:flowers){
            System.out.println(flower.toUpperCase());
        }
        String[] cities={"Chicago","New York","Miami","Doha","Tokio","Denver"};
        //chicago@gmail.com
        //put it in storage for future usage
        String[] cityEmails=new String[cities.length];
        int i=0;
        for(String city:cities){

             cityEmails[i]=city.toLowerCase().concat("@gmail.com").replace(" ","");
            i=i+1;

        }System.out.println(Arrays.toString(cityEmails));


    }
}
