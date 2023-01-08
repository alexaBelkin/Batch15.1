package Loops;

public class DoWhilePractice4 {
    public static void main(String[] args) {
        /*
        String str="@$%SdvH&S345"
        count the number of letters---> Letters count is ->5
        count number of digits--->digit count--> 3
        count number of other symbols---> symbol-->4
         */

        String str="@$%SdvH&S345";
       str.charAt(0);//--->@
        //HOW TO CHECK IF A CHARACTER IS A LETTER/DIGIT/SYMBOL
        //
        //HOW TO EXECUTE SOMETHING REPEATEDLY?
        // NEED TO CREATE A LOOP
        int indexNumber=0,letterCounter=0,digitCounter=0,symbolCounter=0;

        do{

           char ch= str.charAt(indexNumber);
           if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
               letterCounter++;

           }else if (ch>='0'&&ch<='9'){
               digitCounter++;
           }else{
               symbolCounter++;
           }
indexNumber++;
        }while(indexNumber<str.length());
        System.out.println("Letter count--> "+letterCounter);
        System.out.println("Digit count--->"+digitCounter);
        System.out.println("Symbol count-->"+symbolCounter);

        String newWord="I can do it on my own this time";
        //find letters 'o' and 'O' and count them
        int index=0, count=0;
        do{
          char letter=  newWord.charAt(index);
          if(letter=='O'||letter=='o'){
              count++;
          }
          index++;

        }while(index<newWord.length());
        System.out.println("Count of 'o'and 'O' is "+count);

    }
}
