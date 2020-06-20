package part1.arrays;

public class Arrays_ex02 {

    // Write a Java program to calculate the average value of array elements: [1, 7, 3, 10, 9]
    // Output: 6

    private static int calculateAverage(int[] numbers) {
        int result = 0;
        for (int el : numbers) {
            result += el;
        }
        return result / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        System.out.println(calculateAverage(numbers));
    }
}
