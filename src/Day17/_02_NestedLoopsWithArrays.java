package Day17;

public class _02_NestedLoopsWithArrays {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

//        Finding length of each inside array
//        numbers[0].length;
//        numbers[1].length;
//        numbers[2].length;

//        Printing each element of array
//        System.out.println(numbers[1][0]);
//        System.out.println(numbers[1][1]);
//        System.out.println(numbers[1][2]);

        // int i = 1;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }

        }


    }

}
