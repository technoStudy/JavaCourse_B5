package Day26._03_Enum2;

public class Main {

    public static void main(String[] args) {

        WaterLevel boiler = new WaterLevel(Level.HIGH);

        switch (boiler.getWaterLevel()) {

            case LOW:
                System.out.println("Water level is low!");
                break;
            case MEDIUM:
                System.out.println("Water level is medium!");
                System.out.println("That is good!");
                break;
            case HIGH:
                System.out.println("Water level is high!");
                System.out.println("Warning!");
                break;
            default:
                System.out.println("The water level is not recognized!");

        }

    }

}
