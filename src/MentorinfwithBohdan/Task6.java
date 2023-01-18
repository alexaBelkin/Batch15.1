package MentorinfwithBohdan;

public class Task6 {
    public static void main(String[] args) {
        String str="soap"; //hacker app

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='o'||str.charAt(i)=='a') {
                str=str.replace(str.charAt(i)+"","");
                i--;
            }
        }
        System.out.println(str);
    }
}
