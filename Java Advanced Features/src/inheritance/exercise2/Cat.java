package inheritance.exercise2;

// Create classes Dog and Cat.

public class Cat extends Animal {

    private static final String voice = "meow!";

    public Cat(String name, int age) {
        super(voice, name, age);
    }
}