package Day26._01_FinalWithPrimitiveTypes;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(2015);
        car1.name = "BMW";

        System.out.println(car1.name);
        System.out.println(car1.YEAR);

        car1.name = "BMW 520i";
        System.out.println(car1.name);

//        car1.YEAR = 2020; - this will not work because YEAR is final
        System.out.println(car1.YEAR);

    }

}
