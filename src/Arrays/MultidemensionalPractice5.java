package Arrays;

public class MultidemensionalPractice5 {
    public static void main(String[] args) {
        /*
        -COMPUTERS-
        APPLE-2500
        DELL-1800
        ACER-1399
        SAMSUNG- 1550.99

        TV---> LG(1100), SONY(800), TOSHIBA(599)
        SPEAKERS->FOOGLE(99.99) BOSE(120.99) JBL(89.95)
         */
        String[][] items={{"APPLE","DELL","ACER","SAMSUNG"},{"LG","SONY","TOSHIBA"},{"GOOGLE","BOSE","JBL"}};
        double[][] prices={{2500,1800,1399,1500.99},{1100,800,599},{99.99,120.99,89.95}};
        for(String[] section:items){
            for(String brand:section){
                for(double[] section1:prices){
                    for(double price1:section1){
                        System.out.println(brand+"-->"+price1);

                    }

                }

            }

        }



    }
}
