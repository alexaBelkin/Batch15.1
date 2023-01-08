package Arrays;

public class MultidemantionalPractice2 {
    public static void main(String[] args) {
        String[][] citiesFromStates={{"Los Angeles","Sacramento"},{"Chicago","Springfield","Des Plains"},{"Baltimore","Rockville"}};
        //use for each loop to show name of the cities
        //print "Chicago is IL" when you find Chicago
        for(String[] nameCity:citiesFromStates){
            for(String city:nameCity){
                if (city.equals("Chicago")){
                    System.out.println(city+" is in IL");
                }else{System.out.println(city);}

            }

        }
    }
}
