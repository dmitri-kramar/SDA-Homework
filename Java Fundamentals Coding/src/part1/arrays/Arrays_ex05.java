package part1.arrays;

import java.util.Arrays;

public class Arrays_ex05 {

    // Write a Java program to reverse an array of integer values: [1, 7, 3, 10, 9]
    // Output: [9, 10, 3, 7, 1]

    private static int[] reverse(int[] numbers) {
        int[] results = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            results[i] = numbers[numbers.length-(i+1)];
        }
        return results;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        System.out.println(Arrays.toString(reverse(numbers)));
    }
}
