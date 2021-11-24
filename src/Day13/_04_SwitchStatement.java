package Day13;

import java.util.Scanner;

public class _04_SwitchStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter role value: ");
        int roleValue = scanner.nextInt();

        switch (roleValue) { // the switch statement will only check for equality of case below

            case 1:
                System.out.println("You are an ADMIN!");
                break; // after printing break will move outside of switch
            case 2:
                System.out.println("You are a TEACHER!");
                break;
            case 3:
                System.out.println("You are a STUDENT!");
                break;
            default:
                System.out.println("You are a GUEST!");
        }



//        if (roleValue == 1) {
//            System.out.println("You are an ADMIN!");
//        } else if (roleValue == 2) {
//            System.out.println("You are a TEACHER!");
//        } else if (roleValue == 3) {
//            System.out.println("You are a STUDENT!");
//        } else {
//            System.out.println("You are a GUEST!");
//        }

    }

}
