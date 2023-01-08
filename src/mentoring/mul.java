package mentoring;

public class mul {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            for(int k=1;k<=10;k++){

                System.out.println(i+"*"+k+"="+(i*k));
                if(k==5){break;}
            }
            System.out.println("==========");
        }
    }

}
