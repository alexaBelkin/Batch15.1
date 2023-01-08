package stringBasics;

public class Practice1 {
    public static void main(String[] args){

        String word="Fluffy";
        System.out.println(word);
        System.out.println(word+5+3);// Fluffy53


        //reassignment
        word="Test";
        System.out.println(word);

        // compound assignment
        word+=word;
        System.out.println(word);

        String text="1234";
        System.out.println(text +100);
        System.out.println(text+word);//1234TestTest
        System.out.println(text);
        text+="5";
        System.out.println(text); // 12345

        int number=333;
        text +=number;
        System.out.println(text);
        String name="java"+111;
        System.out.println(name);
        String lastNAme="Selenium"+ 't';
        System.out.println(lastNAme);

        name="Jenny";
        lastNAme="Brown";
        name=name+ lastNAme;
        System.out.println(name); //JennyBrown
        System.out.println(lastNAme);//brown

        String lunch= new String("burger");
        System.out.println(lunch);// burger

        lunch+=" with fries";
        System.out.println(lunch);










    }
}
