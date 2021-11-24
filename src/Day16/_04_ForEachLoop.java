package Day16;

public class _04_ForEachLoop {

    public static void main(String[] args) {

        String[] cars = {"BMW", "Mercedes", "Tesla", "Toyota", "Honda"};

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }


        for (String car : cars) { // index and length is handled by JAVA
            // 1- String car = "BMW";
            // 2- String car = "Mercedes";
            // 3- String car = "Tesla";
            // 4- String car = "Toyota";
            // 5- String car = "Honda";
            System.out.println(car);

            // Disadvantage of For-Each Loop
            // We don't know the index
            // We cannot print in reverse
        }

//        System.out.println(car); -> This is not accessible

    }

}
