package part1.arrays;

public class Arrays_ex01 {

    // Write a Java program to sum values of an array: [1, 7, 3, 10, 9]
    // Output: 30

    private static int calculateSum(int[] numbers) {
        int result = 0;
        for (int el : numbers) {
            result += el;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        System.out.println(calculateSum(numbers));
    }
}
