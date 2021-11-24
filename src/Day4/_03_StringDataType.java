package Day4;

public class _03_StringDataType {

    public static void main(String[] args) {

//      String message = new String("Hello World"); - supposed to be like this
        String message = "Hello World"; // short way to create a String variable
        System.out.println(message);
        System.out.println("message");

        String schoolName = "TechnoStudy" + "!!";
        String courseName = "SDET Course";

        System.out.println(schoolName + " " + courseName);


        String question = "What is your name?";
        String answer = "My name is: ";
        String name = "Halit";

        System.out.println(question+ "\n" + answer + name);

    }

}
