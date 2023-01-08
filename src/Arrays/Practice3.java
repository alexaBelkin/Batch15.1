package Arrays;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {
        //print out name if the name has letter L into it
        String[] studentsNames=new String[9]; //[] position does not really affect but needs to be after data type
        studentsNames[0]="Alexa";
        studentsNames[1]="Roman";
        studentsNames[2]="Efe";
        studentsNames[3]="Sulan";
        studentsNames[4]="Stan";
        studentsNames[5]="Diana";
        studentsNames[6]="Egor";
        System.out.println(Arrays.toString(studentsNames));

        for(int i=0;i<studentsNames.length;i++){

            if(studentsNames[i]==null){
                continue;
            }
            if(studentsNames[i].contains("l")){
                System.out.println(studentsNames[i]);
            }

        }

    }
}
