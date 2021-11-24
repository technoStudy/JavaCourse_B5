package Day13;

public class _05_NestedIf {

    public static void main(String[] args) {

        boolean condition = true;
        boolean anotherCondition = false;

        // BASIC NESTED IF STRUCTURE
        if (condition) {

            if (anotherCondition) {
                System.out.println("Condition 2 is true!");
            } else {
                System.out.println("Condition 1 is true!");
            }

        } else {
            System.out.println("No condition is true!");
        }

    }

}
