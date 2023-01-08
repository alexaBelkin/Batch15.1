package object;

import java.util.Arrays;

public class testVegie {
    public static void main(String[] args) {
        String[] items={"red tomatoes","green tomatoes","avocado"};
        MethodPractice3.veggie(items);
        int counter=MethodPractice3.veggie(items);
        System.out.println(counter);
       String[] product= MethodPractice3.veggie(items,7);
        System.out.println(Arrays.toString(product));

    }
}
