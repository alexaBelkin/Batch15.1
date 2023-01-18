package MapPractice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class StudentDesk {
        /*
    FirstName: David
    LastName: Pena
    Age: 25
    Gender: M
    City: Chicago

    FirstName: Jeremiah
    LastName: Michaelson
    Age: 15
    Gender: M
    City: LakeForest

    FirstName: Michael
    LastName: White
    Age: 35
    Gender: M
    City: Winnetka

    FirstName: Sarah
    LastName: Star
    Age: 29
    Gender: F
    City: Chicago
    }*/
        public static void main(String[] args) {

            HashMap<String, String> student1 = new HashMap<>();
            HashMap<String, String> student2 = new HashMap<>();
            HashMap<String, String> student3 = new HashMap<>();
            HashMap<String, String> student4 = new HashMap<>();

            student1.put("FirstName", "David");
            student1.put("LastName", "Pena");
            student1.put("Age", "25");
            student1.put("Gender", "M");
            student1.put("City", "Chicago");

            student2.put("FirstName", "Jeremiah");
            student2.put("LastName", "Michaelson");
            student2.put("Age", "15");
            student2.put("Gender", "M");
            student2.put("City", "LakeForest");

            student3.put("FirstName", "Michael");
            student3.put("LastName", "White");
            student3.put("Age", "35");
            student3.put("Gender", "M");
            student3.put("City", "Winnetka");

            student4.put("FirstName", "Sarah");
            student4.put("LastName", "Star");
            student4.put("Age", "29");
            student4.put("Gender", "F");
            student4.put("City", "Chicago");

            List<HashMap<String, String>> listOfStudents = new ArrayList<>();

            listOfStudents.add(student1);
            listOfStudents.add(student2);
            listOfStudents.add(student3);
            listOfStudents.add(student4);

            System.out.println(listOfStudents);

            //find students who are age of 30 or younger an d they are from Chicago
            for(HashMap<String,String> person:listOfStudents){
                if(Integer.parseInt(person.get("Age"))<30&&person.get("City").equalsIgnoreCase("Chicago")){
                    System.out.println(person.get("FirstName"));
                }
            }


            for (HashMap<String, String> student : listOfStudents) {
                if (!student.get("City").equalsIgnoreCase("chicago")) {
                    System.out.println(student.get("FirstName") + "you can join online");
                }
            }

            for (int i = 0; i < listOfStudents.size(); i++) {
                if (!listOfStudents.get(i).get("City").equalsIgnoreCase("Chicago")) {
                    System.out.println(listOfStudents.get(i).get("FirstName") + " *** you can join online! ");
                }

            }

            List<List<String>>  result1 =  fullNameFinder(listOfStudents);
            HashMap<String , List>  result2 =fullNameFinder1(listOfStudents);

            for ( Object city : result2.get("Cities")){
                if(city.toString().equalsIgnoreCase("Chicago")){
                    System.out.println("you are lucky since you are in " + city);
                }
            }



        }


        public static HashMap<String, List> fullNameFinder1(List<HashMap<String, String>> list) {

            List<String > firstName = new ArrayList<>();
            List<String > lastName = new ArrayList<>();
            List<String > city = new ArrayList<>();

            HashMap<String, List> map1 = new HashMap<>();
            //List<List<String>> fullNames = new ArrayList<>();

            for (HashMap<String, String> student : list) {
                firstName.add(student.get("FirstName"));
                lastName.add(student.get("LastName"));
                city.add(student.get("City"));

            }

            map1.put("FirstNames", firstName);
            map1.put("LastNames", lastName);
            map1.put("Cities" , city);
            System.out.println(map1);
            return map1;


        }
        public static List<List<String>> fullNameFinder(List<HashMap<String, String>> list) {
            List <String> firstNames = new ArrayList<>();
            List <String>  lastNames = new ArrayList<>();
            List<List<String>> fullNames = new ArrayList<>();
            for (HashMap<String, String> student : list) {
                firstNames.add(student.get("FirstName"));
                lastNames.add(student.get("LastName"));
            }
            fullNames.add(firstNames);
            fullNames.add(lastNames);
            System.out.println(fullNames);
            return fullNames;
        }


    }

