package Day28;

public class MyPlanet {

    private String planet = "Earth";
    private String satellite = "Moon";
    private int daysInYear = 365;

    // getter - planet field
    public String getPlanet() {
        return planet;
    }

    // getter - satellite field
    public String getSatellite() {
        return satellite;
    }

    // getter - daysInYear field
    public int getDaysInYear() {
        return daysInYear;
    }

    // setter - planet field
    public void setPlanet(String planet) {
        this.planet = planet;
    }

    // setter - satellite field
    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }

    // setter - daysInYear field
    public void setDaysInYear(int daysInYear) {
        this.daysInYear = daysInYear;
    }

}