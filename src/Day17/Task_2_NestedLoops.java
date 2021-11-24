package Day17;

public class Task_2_NestedLoops {

    // print the following pattern
    // *
    // **
    // ***
    // ****


    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
