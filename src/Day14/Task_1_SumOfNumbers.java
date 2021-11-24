package Day14;

public class Task_1_SumOfNumbers {

    // write a java program which calculates the sum of numbers [0 to 5];
    // using for-loop

    // 0 + 1 + 2 + 3 + 4 + 5

    public static void main(String[] args) {

        int sum = 0;

//        sum += 0;
//        sum += 1;
//        sum += 2;
//        sum += 3;
//        sum += 4;
//        sum += 5;

        for (int i = 0; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);

    }

}
