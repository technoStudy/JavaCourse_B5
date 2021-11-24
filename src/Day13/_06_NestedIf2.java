package Day13;

import java.util.Scanner;

public class _06_NestedIf2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you a Student at Techno Study?: ");
        boolean iAmStudentAtTechnoStudy = scanner.nextBoolean();
        boolean batch5;

        if (iAmStudentAtTechnoStudy) {
            System.out.print("Are you a Student of BATCH5?: ");
            batch5 = scanner.nextBoolean();

            if (batch5) {
                System.out.println("Welcome!!");
            } else {
                System.out.println("You are not student of Batch5");
            }

        } else {
            System.out.println("You can not enter on campus");
        }
    }

}
