package primitives;

public class FARM {
    public static void main(String[] args) {
        int cows=15;
        int chickens=45;
        int cowLeg=4;
        int chickenLeg=2;

        int total= cows*cowLeg + chickens*chickenLeg;


        System.out.println("Total number of the legs is " + total);

        // if a single cow cost 1345.86 and a chicken cost 10.99
        // we need to calculate worth of animals
        // show resuklt as The worth of the animals is ...

        double cow1=1345.86, chicken1= 10.99, totalCoast;
        totalCoast= cow1*cows + chicken1*chickens;
        System.out.println("The worth of the animals is "+ totalCoast);

        double share= totalCoast/2;
        System.out.println(share);






    }
}
