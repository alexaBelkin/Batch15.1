package Switch;

public class Practice1 {
    public static void main(String[] args) {

        int count=1;
        switch (count){
            case 5 :
                System.out.println("RED");
                break;
            case 2:
                System.out.println("YelloW");
                break;
            case 1:
                System.out.println("WHITE");
                break;
            case 10:
                System.out.println("PINK");
                break;
            default:
                System.out.println("No color");
                break;
        }
    }
}
