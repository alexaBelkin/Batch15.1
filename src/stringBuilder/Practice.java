package stringBuilder;

public class Practice {
    public static void main(String[] args) {
        StringBuilder success=new StringBuilder("Tech");
        System.out.println(success.length());
        success.append("nology");
        System.out.println(success);
        System.out.println(success.substring(5));
        success.insert(5,"TRUE");
        System.out.println(success);
        success.insert(4,true);
        System.out.println(success);

        //delete()-deleteChar()
        //TechtruenTRUEology
        success.delete(4,8);
        System.out.println(success);
        //success.delete(5,9);
        //System.out.println(success);

        success.delete(success.indexOf("T",1),success.indexOf("E")+1);
        System.out.println(success);

        success.delete(success.lastIndexOf("T"),success.indexOf("E")+1);
        System.out.println(success);



    }
}
