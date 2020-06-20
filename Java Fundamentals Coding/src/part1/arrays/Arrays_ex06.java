package part1.arrays;

public class Arrays_ex06 {

    // Write a Java program to find the number of even
    // and odd integers in a given array of integers: [1, 7, 3, 10, 9]
    // Output: Odd=4; Even=1

    private static void calculateOddAndEven(int[] numbers) {
        int odd = 0, even = 0;
        for (int el : numbers) {
            if (el % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.print("Odd=" + odd + ", ");
        System.out.println("Even=" + even);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 7, 3, 10, 9};
        calculateOddAndEven(numbers);
    }
}
