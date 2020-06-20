package encapsulation.exercise1;

// Create class Dog.

public class Dog {

    // Add private fields to the class, like name, age, gender, race, weight.

    private final String name, gender, race;
    private int age;
    private double weight;

    // Create constructor that accepts all of the class fields.

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    // Create additional constructor , that will accept only gender and race.
    // It should call main constructor with default (???) values.

    public Dog(String gender, String race) {
        this(null, 0, gender, race, 0.0d);
    }

    // Create getters and setters for age and weight.

    // Add verification for all arguments passed to the setters.
    // E.g. setWeight method should not accept values below or equal to 0.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        }
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                "}";
    }
}