package object;

public class shape {
    //calculate perimeter of rectangle(pryamougolnik)
    //width,length multiply by two(w+l)
//    int w=5,l=10,p;
//    p=2*(w+l);
    public void calculatorPer(int width,int length){
        int perimeter=2*(width+length);
        System.out.println("The perimiter of rectangle is: "+perimeter);


    }
    //create a method that will calculate are of a triangle
    //A=(base*heght)/2  (ploshad')
    public void area(int base,int height){
        int areaOfTr=(base*height)/2;
        System.out.println("The are of triangle is: "+areaOfTr);
    }

}
