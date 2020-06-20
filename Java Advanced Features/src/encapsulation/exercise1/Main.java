package encapsulation.exercise1;

public class Main {

    // Create object of class Dog. Verify if everything works as expected.

    public static void main(String[] args) {

        // Testing the first constructor.

        Dog testDog1 = new Dog("Rex", 8, "male", "shepherd", 7.2);
        System.out.println(testDog1.toString() + "\n");

        // Testing the second constructor.

        Dog testDog2 = new Dog("female", "hound");
        System.out.println(testDog2.toString() + "\n");

        // Testing the setters and getters.

        testDog2.setAge(4);
        System.out.println("Set the age to 4 | Current age = " + testDog2.getAge());

        testDog2.setWeight(-9);
        System.out.println("Set the weight to -9 | Current weight = " + testDog2.getWeight());

        testDog2.setWeight(5.5);
        System.out.println("Set the weight to 5.5 | Current weight = " + testDog2.getWeight());

        System.out.println(testDog2.toString());
    }
}