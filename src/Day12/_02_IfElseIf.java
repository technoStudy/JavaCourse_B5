package Day12;

public class _02_IfElseIf {

    // If temp >= 30 print hot
    // If temp >= 18 && < 30 print it is a good weather
    // If temp < 18 print cold

    public static void main(String[] args) {

        int temp = 5;

        if (temp >= 30){
            System.out.println("It is a hot day!");
        }else if (temp >= 18 && temp < 30){
            System.out.println("It is a good weather!");
        }else {
            System.out.println("It is a cold day!");
        }










//        if (temp >= 30){
//            System.out.println("It is hot!");
//        }
//
//        if (temp >= 18 && temp < 30){
//            System.out.println("It is a good weather");
//        }
//
//        if (temp < 18){
//            System.out.println("It is cold!");
//        }
    }

}
