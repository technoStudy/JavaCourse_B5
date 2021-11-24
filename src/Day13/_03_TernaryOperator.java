package Day13;

public class _03_TernaryOperator {

    public static void main(String[] args) {

        int income = 75_000;
        String className = income > 100_000 ? "First Class" : "Economy Class";

//        if (income > 100_000) {
//            className = "First Class";
//        } else {
//            className = "Economy Class";
//        }

        System.out.println(className);

    }

}
