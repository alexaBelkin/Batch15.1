package Collections;

import java.util.ArrayList;

public class Practice4 {
    public static void main(String[] args) {
        //create an arrayList to store 5 city names
        /*implement logic to print only city names that have only 4 or more letters
         */
        ArrayList<String> cities=new ArrayList<>();
        cities.add("Chicago");
        cities.add("Indianapolis");
        cities.add("Philadelphia");
        cities.add("LA");
        cities.add("Rome");
        for(String city :cities){
            if(city.length()>=4){
                System.out.println(city);
            }
        }
        System.out.println("-------");
        for(int i=0;i<cities.size();i++){
            if(cities.get(i).length()>=4){
                System.out.println(cities.get(i));
            }
        }




    }

}
