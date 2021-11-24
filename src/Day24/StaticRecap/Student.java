package Day24.StaticRecap;

public class Student {

    String studentName;
    int studentAge;

    static int numberOfStudentsEnrolledToCourse = 0;


    void registerCourse() {
        numberOfStudentsEnrolledToCourse++;
    }

    static void printNumberOfStudents() {
        System.out.println("Number of students enrolled the course: " + numberOfStudentsEnrolledToCourse);
    }

}
