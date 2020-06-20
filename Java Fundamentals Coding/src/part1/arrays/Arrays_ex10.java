package part1.arrays;

import java.util.Arrays;

public class Arrays_ex10 {

    // Write a Java program to find all pairs of elements in an array
    // whose sum is equal to a specified number: [1, 2, 7, 3, 10, 2, 9] with sum 4
    // Output: 1-3; 2-2

    private static void printPairs(int sum, int[] n) {
        StringBuilder sb = new StringBuilder();
        String pair = "";

        Arrays.sort(n);

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == sum) {
                    String temp = n[i] + "-" + n[j] + "; ";
                    if (!temp.equals(pair)) {
                        pair = temp;
                        sb.append(temp);
                    }
                }
            }

            if (n[i] == sum) {
                break;
            }
        }

        if (sb.length() > 4) {
            System.out.println(sb.substring(0, sb.length() - 2));
        } else {
            System.out.println("No pairs.");
        }
    }

    public static void main(String[] args) {
        int sum = 4;
        int[] numbers = {1, 2, 7, 3, 10, 2, 9};
        printPairs(sum, numbers);
    }
}