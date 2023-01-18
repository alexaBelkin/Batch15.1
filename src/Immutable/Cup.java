package Immutable;

public class Cup {
    private int size = 3 ;
    private String color;
    private void keepWarm() {
        System.out.println("*******");
    }
    public  int getSize (){
        return size;
    }
    public static void main(String[] args) {
        Cup c = new Cup();
        System.out.println(c.color);
        c.keepWarm();
    }
}
