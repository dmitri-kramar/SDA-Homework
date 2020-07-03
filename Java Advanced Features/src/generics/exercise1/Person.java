package generics.exercise1;

// Create a Person class that will implement a Comparable interface.

public class Person implements Comparable<Person> {

    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    // Person class should implement compareTo method,
    // that will verify if one person is taller than another.

    @Override
    public int compareTo(Person otherPerson) {
        return Double.compare(this.height, otherPerson.height);
    }
}