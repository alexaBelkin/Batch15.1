package MentorinfwithBohdan;

public class task12 {
    public static void main(String[] args) {

        //first 10 numbers of febanachi
        //starts with 0 and 1 and next number is sum of first two (0(a),1(b),1(c),2,
        int a = 0; //indx 0
        int b = 1; //index1
        int c = 0;//indx2
//0112
        for (int i = 0; i < 10; i++) {
            System.out.print(a+" ");
            c=a+b; //0+1=1
            a=b;//1
            b=c;//1

        }
    }
}
