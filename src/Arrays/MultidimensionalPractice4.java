package Arrays;

public class MultidimensionalPractice4 {
    public static void main(String[] args) {
        String[][] menu={{"steak","pasta","fies"},{"olivie","cesar"},{"ice cream","cake","candy","pie"}};
        System.out.println( menu[2][1]);
        System.out.println(menu[0][2]);
        for(int page=0;page< menu.length;page++){
            for(int item=0;item<menu[page].length;item++){
                System.out.println(menu[page][item]);
                if(menu[page][item].equalsIgnoreCase("ice cream")){
                    System.out.println("kids want to get "+menu[page][item]);
                }

            }

        }
        System.out.println("=========");
        for(String[] page:menu){
            for(String item:page){
                System.out.println(item+"<<from for each loop");

            }

        }
    }
}
