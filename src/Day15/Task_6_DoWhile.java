package Day15;

public class Task_6_DoWhile {

    // print odd numbers from 1 to 30 (using do while loop)

    public static void main(String[] args) {

        int counter = 1;

        do {
            System.out.println(counter);
            counter += 2;
        } while (counter <= 30);

    }

}
