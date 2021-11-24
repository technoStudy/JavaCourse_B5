package Day26._03_Enum3;

public class Main {

    public static void main(String[] args) {

        Directions direction1 = Directions.EAST;
        System.out.println(direction1.shortName);
//        direction1.shortName = "H"; - cannot do this - shortName is FINAL

    }

}
