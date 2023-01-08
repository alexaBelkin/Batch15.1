package Arrays;

public class InbentoryFORLOOP {
    public static void main(String[] args) {
        //explanation in multidemensionalPractice5
        //show google products which are less than $100

        String[][] items={{"APPLE","DELL","ACER","SAMSUNG"},{"LG","SONY","TOSHIBA"},{"GOOGLE","BOSE","JBL"}};
        double[][] prices={{2500,1800,400,1399,1500.99},{1100,800,599},{99.99,120.99,89.95}};
        for(int i=0;i<items.length;i++){
            for(int j=0;j<items[i].length;j++){
                if(items[i][j].equalsIgnoreCase("google")&&prices[i][j]<100){
                    System.out.println(items[i][j]+" This is an item from google"+prices[i][j]);
                }
                //System.out.println(items[i][j]+" is $"+prices[i][j]);
            }
        }

    }
}
