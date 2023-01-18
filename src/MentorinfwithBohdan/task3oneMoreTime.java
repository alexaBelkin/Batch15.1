package MentorinfwithBohdan;

public class task3oneMoreTime {
    public static void main(String[] args) {
        String str="hi people there";
        String[] str1=str.split(" ");
        String reversed="";
        for(int i=0;i< str1.length;i++){
            String s=str1[i]+" ";
            for(int k=s.length()-1;k>=0;k--){
                reversed+=s.charAt(k)+"";
            }
        }
        System.out.println(reversed.trim());
    }
}
