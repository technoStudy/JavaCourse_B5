package Day15;

public class _02_WhileLoopVsForLoop {

    public static void main(String[] args) {

        // For-Loop: when we know how many times we are going to iterate
        // While-Loop: when we DON'T know how many times we are going to iterate

        // For-Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }


        // While-Loop
        int counter = 0;
        while (counter < 5) {
            System.out.println("Hello World");
            counter++;
        }

    }

}
