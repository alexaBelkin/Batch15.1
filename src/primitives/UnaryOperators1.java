package primitives;

public class UnaryOperators1 {
    public static void main(String[] args) {
        int studentNumber=23;
        System.out.println(studentNumber);

        studentNumber++;
        System.out.println(studentNumber); //24
        ++studentNumber;
        System.out.println(studentNumber);

  ///==========
        System.out.println("======");
        System.out.println(studentNumber++); //25
        System.out.println(studentNumber); //26

        System.out.println("======");
        System.out.println(++studentNumber);// 27
        System.out.println(studentNumber);

///==========

        studentNumber++;
        System.out.println(studentNumber);

        System.out.println(studentNumber++); // --> shows 28 but value became 29 behind the scene
        System.out.println(studentNumber);//29

        //preDecrement
       int number=12;
       --number;
        System.out.println(number);//11

        number--;
        System.out.println(number);//10

        //difference btw pre and post
        System.out.println(number--); // shows 9 and value is 9
        System.out.println(number); //9
        System.out.println(number--); // shows 9 and value is 8
        System.out.println(number);




    }
}
