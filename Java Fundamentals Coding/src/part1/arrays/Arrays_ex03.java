package part1.arrays;

public class Arrays_ex03 {

    // Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9]
    // Output: 1, 7, 3, 9

    private static void printOdd(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        for (int el : numbers) {
            if (el % 2 != 0) {
                sb.append(el).append(", ");
            }
        }

        if (sb.length() > 0) {
            System.out.println(sb.substring(0, sb.length() - 2));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        printOdd(numbers);
    }
}
