package Arrays;

public class ForEachPractice3 {
    public static void main(String[] args) {
        double[] changes={2.34,4.5,1.25,3.40,1.20};
        //By using for each loops to find out total charges
        double total=0;
        int i=0;
        for(double change:changes){
            total+=change;
        }
        System.out.println(total);

        int[] numbers={1,2,3,5,6,7};
        //find the missing number from given pattern
        for(int ind=0;ind<numbers.length-1;ind++){
            if(numbers[ind+1]-numbers[ind]>1){
                System.out.println(numbers[ind]+1);

            }


        }


    }
}
