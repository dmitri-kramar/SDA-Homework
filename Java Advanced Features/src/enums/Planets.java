package enums;

// Create enum Planets.

public enum Planets {
    MERCURY("Small", 0.61),
    VENUS("Average", 0.28),
    EARTH("Average", 0),
    MARS("Small", 0.52),
    JUPITER("Huge", 4.2),
    SATURN("Huge", 8.52),
    URANUS("Huge", 18.21),
    NEPTUNE("Huge", 29.09),
    PLUTO("Small", 33.12);

    String size;
    String name;
    double distanceFromEarth;

    Planets(String size, double distanceFromEarth) {
        this.size = size;
        this.name = name().substring(0, 1) + name().substring(1).toLowerCase();
        this.distanceFromEarth = distanceFromEarth;
    }

    // Create distanceFromEarth method.

    public String distanceFromEarth() {
        return distanceFromEarth + " AU from Earth";
    }

    // Override toString method. It should print relative size
    // of a planet and its name. E.g. "Huge Jupiter", "Small Pluto".

    @Override
    public String toString() {
       return size + " " + name;
    }
}