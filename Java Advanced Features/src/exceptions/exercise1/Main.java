package exceptions.exercise1;

import java.util.Scanner;

// Write an application that will read the input and print back
// value that user provided, use try catch statements to parse the input:
// Input: 10 | Output: int --> 10
// Input: 10.0 | Output: double --> 10.0
// Input: "Hello!" | Output: "Hey! That’s not a value! Try once more."

public class Main {

    private static void printValue(double value) {
        if (value % 1 == 0) {
            System.out.println("int -> " + (int) value);
        } else {
            System.out.println("double -> " + value);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            printValue(Double.parseDouble(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Hey! That’s not a value! Try once more.");
        }
    }
}