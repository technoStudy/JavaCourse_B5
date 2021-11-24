package Day17;

public class Task_3_Printing2DArray {

    public static void main(String[] args) {

        // Print 2D array using loops
        String[][] strArray = {{"abc", "def", "ghi"}, {"jkl", "mno", "prs"}};

        for (int i = 0; i < strArray.length; i++) {

            for (int j = 0; j < strArray[i].length; j++) {
                System.out.println(strArray[i][j]);
            }

        }

    }

}
