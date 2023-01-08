package Loops;

public class ForEachPractice1 {
    public static void main(String[] args) {
        int[] number={3,5,6,7,8,9,10};

        for(int num:number){
            System.out.println(num);

            String[] items={"Cup","bottle","Micrp"};
            for(String it:items){
                System.out.println(it);
            }
        }
    }
}
