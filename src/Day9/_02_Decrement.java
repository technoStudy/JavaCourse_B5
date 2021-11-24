package Day9;

public class _02_Decrement {

    public static void main(String[] args) {

        // decrement : decrease the value by 1

        int x = 5;
        x--;
        System.out.println(x);


        int y = 10;
        System.out.println(--y);


        int c = 15;
        // post-decrement, value is returned first and then it is decreased by 1
        System.out.println(c--);
        System.out.println(c);

    }

}
