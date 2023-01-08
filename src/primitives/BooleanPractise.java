package primitives;

public class BooleanPractise {
    public static void main(String[] args) {

        //true/ false

        boolean isCold= true;

        boolean isBreak;
        isBreak=false;

        isCold= false;

        System.out.println(isBreak);
        System.out.println(isCold);

        //boolean isStuding= "yes" you can not assign yes or no to boolean type (compile time error)

        // 2=2 --> yes
       // 2 == 2 //double equal sign means check left as a right side

        boolean result1= 2 == 2;
        System.out.println(">>>>"+ result1);

        boolean result2= 2==3;
        System.out.println(result2); // shows false


        // (!) makes the boolean value to opposite (if its a true value thats going to be false,
        // if its false it reverse to true

        boolean isLightOn= true;
        System.out.println(isLightOn); //true
        System.out.println(!isLightOn);// false
        System.out.println(isLightOn); // true

        isLightOn= !isLightOn;
        System.out.println(isLightOn);














    }
}
