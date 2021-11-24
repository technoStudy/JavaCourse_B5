package Day15;

public class _04_DoWhileLoop {

    public static void main(String[] args) {

        int counter = 0;
        while (counter > 1) { // while loop checks condition first
            System.out.println("Hello");
            counter++;
        }


        int counter2 = 0;
        do { // do - while loop is guaranteed to execute at least once
            System.out.println("Hello");
            counter2++;
        } while (counter2 > 1);

    }

}
