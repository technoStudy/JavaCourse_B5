package Day5.StringMethodsTasks;

public class Task4 {

    // check whether string "Hello, how are you?" is a question

    public static void main(String[] args) {

        String message = "Hello, how are you?";

        boolean isMessageAQuestion = message.endsWith("?");

        System.out.println("is Message a Question: " + isMessageAQuestion);

    }

}
