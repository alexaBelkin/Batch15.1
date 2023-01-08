package Switch;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        /*
        1-it department
          -John
          -Marry
        2-accounting
            -Jake
        3-hr
           -Anna
           -Diana
           -Mike
        4-help desk
           -Efe

         */
        System.out.println("Please choose from following departments: \n1- IT \n2- accounting \n3- HR \n4- Help desk ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();



        switch (number) {
            default:
                System.out.println("please enter right extension!");
                break;
            case 4:
                System.out.println("Who do you want talk with?Efe?");
                sc.nextLine();
                String name3 = sc.nextLine().toUpperCase();
                switch (name3) {
                    case "EFE":
                        System.out.println("Transfering you to " + name3);
                        break;
                    default:
                        System.out.println("please enter right name");
                        break;
                }break;
            case 3:
                System.out.println("Who do you want talk with?Anna, Diana or Mike?");
                sc.nextLine();
                String name2 = sc.nextLine().toUpperCase();
                switch (name2) {
                    case "ANNA":
                    case "DIANA":
                    case "MIKE":
                        System.out.println("Transfering you to " + name2);
                        break;
                    default:
                        System.out.println("please enter right name");
                        break;
                }break;

            case 2:
                System.out.println("Who do you want talk with?We have only Jake here.");
                sc.nextLine();
                String name1 = sc.nextLine().toUpperCase();
                switch (name1) {
                    case "JAKE":
                        System.out.println("Transfering you right now to " + name1);
                        break;
                    default:
                        System.out.println("Please enter right person!");break;
                }break;
            case 1:
                System.out.println("Who do you want talk with? John or Marry?");
                sc.nextLine();
                String name = sc.nextLine().toUpperCase();
                switch (name) {
                    case "JOHN":
                    case "MARRY":
                        System.out.println("Transfering you right now to " + name);
                        break;
                    default:
                        System.out.println("please enter right name");
                        break;
                }break;
        }
    }
}
