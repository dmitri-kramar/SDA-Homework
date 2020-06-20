package part1.arrays;

import java.util.Arrays;

public class Arrays_ex04 {

    // Write a Java program to find the maximum and minimum value of an array: [1, 7, 3, 10, 9]
    // Output: Min=1; Max=10

    private static void printMinAndMax(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print("Min=" + numbers[0] + "; ");
        System.out.println("Max=" + numbers[numbers.length-1]);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        printMinAndMax(numbers);
    }
}
