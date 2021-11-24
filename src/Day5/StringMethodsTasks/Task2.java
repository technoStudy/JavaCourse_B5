package Day5.StringMethodsTasks;

public class Task2 {

    // String numbers = "0.12345678";
    // part1: find the index of 4 in "0.12345678"
    // part2: find the index of . in "0.12345678"


    public static void main(String[] args) {

        String numbers = "0.12345678";

        int indexOf4 = numbers.indexOf('4');
        int indexOfDot = numbers.indexOf('.');

        System.out.println("Index of 4: " + indexOf4);
        System.out.println("Index of . : " + indexOfDot);

    }

}
