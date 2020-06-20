package part1.arrays;

import java.util.Arrays;

public class Arrays_ex07 {

    // Write a Java program to insert an element
    // at a specific position into an array: [1, 7, 3, 10, 9];
    // insert 4 at position 2; remember that an array starts from 0
    // Output: [1, 7, 4, 3, 10, 9]

    private static int[] insert(int[] numbers, int num, int pos) {
        int[] results = new int[numbers.length + 1];
        for (int i = 0; i <= pos; i++) {
            results[i] = numbers[i];
        }
        results[pos] = num;
        for (int i = pos+1; i < results.length; i++) {
            results[i] = numbers[i-1];
        }
        return results;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        int num = 4, pos = 2;
        System.out.println(Arrays.toString(insert(numbers, num, pos)));
    }
}