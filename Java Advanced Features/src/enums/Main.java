package enums;

public class Main {

    public static void main(String[] args) {

        // Verify both methods for multiple planets.

        for (Planets planet : Planets.values()) {
            System.out.println(planet);
            System.out.println(planet.distanceFromEarth() + "\n");
        }
    }
}