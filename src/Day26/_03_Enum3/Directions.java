package Day26._03_Enum3;

public enum Directions {

    // If we have a constructor we need to call constructor for each constant

    EAST("E"),  // <----- we call constructor and initialize shortName
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    final String shortName;

    Directions(String shortName) {
        this.shortName = shortName;
    }

}
