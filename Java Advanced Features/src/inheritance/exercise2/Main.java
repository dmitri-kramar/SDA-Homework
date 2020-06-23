package inheritance.exercise2;

public class Main {

    public static void main(String[] args) {

        // Create simple array of type Animal, that will contain
        // one object of type Dog and one object of type Cat.

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Rex", 5);
        animals[1] = new Cat("Bruno", 2);

        // Using for each loop show which animal gives what
        // kind of voice. How to print a name of an object?

        for (Animal animal : animals) {
            System.out.print(animal.getClass().getSimpleName() + " says ");
            animal.yieldVoice();
        }
    }
}