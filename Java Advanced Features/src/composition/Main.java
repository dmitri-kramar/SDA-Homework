package composition;

public class Main {

    // How to use a Dog object to show all attributes of a Muzzle object?

    private static void printMuzzleParameters(Dog dog) {
        if (dog.getMuzzle() == null) {
            System.out.println("This dog has no muzzle on.");
        } else {
            System.out.println("Price: " + dog.getMuzzle().getPrice());
            System.out.println("Size: " + dog.getMuzzle().getSize());
            System.out.println("Color: " + dog.getMuzzle().getColor());
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        // Create a Muzzle object.

        Muzzle muzzle = new Muzzle(35, 4, "red");

        // Assign the created object to a Dog object.

        dog.setMuzzle(muzzle);
        printMuzzleParameters(dog);
    }
}