package Day24.StaticRecap;

public class MainStudent {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentName = "Almedin";
        student1.studentAge = 25;
        student1.registerCourse();

        Student.printNumberOfStudents();

        Student student2 = new Student();
        student2.studentName = "Mike";
        student2.studentAge = 35;
        student2.registerCourse();

        Student.printNumberOfStudents();

    }

}
