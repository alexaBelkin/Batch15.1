package Arrays;

public class Practice6 {
    public static void main(String[] args) {

        char[] symbols={'a','#','1','W','3','6','@','@','$','&'};
        //print out only bnumbers
        //print out other symbols
        int dit=0,let=0,oth=0;
        for (int i=0;i<symbols.length;i++){
            if(symbols[i]>='0'&&symbols[i]<='9'){
                dit++;
                System.out.println("There are "+symbols[i]+"digits");
            }else if ((symbols[i] >= '!' && symbols[i] <= '/') || (symbols[i] >= ':' && symbols[i] <= '@')) {
                let++;
                System.out.println("There are "+symbols[i]+"symbols");
            }else{
                oth++;
                System.out.println("OTHERS"+symbols[i]);
            }
        }
        System.out.println("============");
        System.out.println("There are "+dit+" digits");
        System.out.println("There are "+let+" letters");
        System.out.println("There are "+oth+" symbols");

        }
//there are ...2..letters
        //there are ...5 digits
        //there are ...1..other synmols
    }

