package part1.arrays;

import java.util.Arrays;

public class Arrays_ex08 {

    // Write a Java program to find the duplicate values of an array of integers: [1, 7, 3, 7, 10, 1, 9]
    // Output: 1 & 7

    private static void printDuplicates(int[] n) {
        StringBuilder sb = new StringBuilder();
        boolean hasDuplicates = false;

        Arrays.sort(n);

        if (n.length == 1) {
            sb.append("No duplicates in the array.   ");
        } else {
            for (int i = 1; i < n.length; i++) {
                if (n[i - 1] == n[n.length - 1]) {
                    sb.append(n[i]).append(" & ");
                    hasDuplicates = true;
                    break;
                }
                if (n[i] == n[i - 1]
                        && (((i + 1 < n.length)
                        && (n[i] != n[i + 1]))
                        || (i == n.length - 1))) {
                    sb.append(n[i]).append(" & ");
                    hasDuplicates = true;
                }
            }
            if (!(hasDuplicates)) {
                sb.append("No duplicates in the array.   ");
            }
        }
        System.out.println(sb.substring(0, sb.length() - 3));
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 7, 10, 1, 9};
        printDuplicates(numbers);
    }
}