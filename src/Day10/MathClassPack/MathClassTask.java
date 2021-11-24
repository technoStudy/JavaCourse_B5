package Day10.MathClassPack;

public class MathClassTask {

    // Create a random integer between 0-200
    // Create another random integer between 0-500

    // sum 2 integers and print the result

    public static void main(String[] args) {

        int randomNumber1 = (int) (Math.random() * 200);
        System.out.println("random1 -> " + randomNumber1);
        int randomNumber2 = (int) (Math.random() * 500);
        System.out.println("random2 -> " + randomNumber2);

        int sum = randomNumber1 + randomNumber2;

        System.out.println(sum);



        // -50 <---------------> 50
        int randomValue = (int) (Math.random() * 100 - 50);

        // -10 <--------------> 20  | bigNumber - smallNumber = length
        // 20 - (-10) = 30 -> length of this range
        int randomValue2 = (int) (Math.random() * 30 - 10);



    }

}
