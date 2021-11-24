package Day17;

public class _05_DebuggingExample {

    // print the following pattern
    // *
    // **
    // ***
    // ****


    public static void main(String[] args) {

        for (int j = 0; j < 4; j++) {

            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
