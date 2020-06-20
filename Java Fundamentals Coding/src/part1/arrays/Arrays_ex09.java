package part1.arrays;

import java.util.Arrays;

public class Arrays_ex09 {

    // Write a Java program to find the second largest element in an array: [1, 7, 3, 10, 9]
    // Output: 9


    private static void printSecondLargest(int[] n) {
        Arrays.sort(n);
        int largest = n[n.length - 1], secondLargest = 0;

        for (int el : n) {
            if (el > secondLargest && el < largest) {
                secondLargest = el;
            }
        }

        if (n.length > 1 && n[0] != n[n.length - 1]) {
            System.out.println(secondLargest);
        } else {
            System.out.println("No second largest number in the array.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        printSecondLargest(numbers);
    }
}