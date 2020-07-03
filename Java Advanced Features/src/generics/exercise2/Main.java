package generics.exercise2;

public class Main {

    public static void main(String[] args) {

        // Add object of type String, Integer
        // and Double to array of that Generic type.

        Generic<String, Integer, Double> gen = new Generic<>();
        gen.setArrayOfObjects("String", 6, 3.432);

        // Print all values of the array within a loop.

        for (Object obj : gen.getArrayOfObjects()) {
            System.out.println(obj);
        }
    }
}