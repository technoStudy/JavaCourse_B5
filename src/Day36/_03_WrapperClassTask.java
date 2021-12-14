package Day36;

public class _03_WrapperClassTask {

    // create a method that accepts an int
    // and returns twice of that int

    // overload this method with wrapper class: Integer

    public static void main(String[] args) {

        System.out.println(twice(5));

        Integer number = 10;
        System.out.println(twice(number));

    }


    public static int twice(int number) {
        return number * 2;
    }

    public static Integer twice(Integer number) {
        return number * 2;
    }

}
