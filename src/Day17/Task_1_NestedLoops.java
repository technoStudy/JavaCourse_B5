package Day17;

public class Task_1_NestedLoops {


    // Print a square 4X4 wide out of '*' character
    // ****
    // ****
    // ****
    // ****


    // Part 2 - print following pattern
    // *****
    // *****
    // *****
    // *****
    // *****
    // *****

    public static void main(String[] args) {

        for (int j = 0; j < 4; j++) {

            for (int i = 0; i < 4; i++) {
                System.out.print("*");
            }

            System.out.println();

        }

        System.out.println();

       for (int j = 0; j < 6; j++) {

           for (int i = 0; i < 5; i++) {
               System.out.print("*");
           }

           System.out.println();

       }

    }

}
