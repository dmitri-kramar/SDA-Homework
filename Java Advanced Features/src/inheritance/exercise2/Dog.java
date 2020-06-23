package inheritance.exercise2;

// Create classes Dog and Cat.

public class Dog extends Animal {

    private static final String voice = "woof!";

    public Dog(String name, int age) {
        super(voice, name, age);
    }
}