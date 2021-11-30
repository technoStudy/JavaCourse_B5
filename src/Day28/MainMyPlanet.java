package Day28;

public class MainMyPlanet {

    public static void main(String[] args) {

        MyPlanet Halit = new MyPlanet();

        System.out.println("Halit's planet: " + Halit.getPlanet());
        System.out.println("Halit's satellite: " + Halit.getSatellite());
        System.out.println("Halit's days in a year: " + Halit.getDaysInYear());


        MyPlanet astronaut = new MyPlanet();

        astronaut.setPlanet("Mars");
        astronaut.setSatellite("Phobos");
        astronaut.setDaysInYear(687);

        System.out.println("Astronaut's planet: " + astronaut.getPlanet());
        System.out.println("Astronaut's satellite: " + astronaut.getSatellite());
        System.out.println("Astronaut's days in a year: " + astronaut.getDaysInYear());

    }

}
