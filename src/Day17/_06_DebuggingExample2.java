package Day17;

public class _06_DebuggingExample2 {

    public static void main(String[] args) {

        String[] cars = {"BMW", "Toyota", "Mercedes"};

        for (int i = 0; i < 6; i++) { // There is problem with i < 6 (find it with debugger)
            System.out.println(cars[i]);
        }

    }

}
