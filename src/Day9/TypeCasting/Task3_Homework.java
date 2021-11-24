package Day9.TypeCasting;

public class Task3_Homework {

    /*

        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        find the actual average for this students

     */

    public static void main(String[] args) {

        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        int sumOfGrades = student1 + student2 + student3 + student4;

        double average = (double) sumOfGrades / 4;

        System.out.println(average);

    }

}
