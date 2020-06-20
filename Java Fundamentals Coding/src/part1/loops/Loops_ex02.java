package part1.loops;

public class Loops_ex02 {

    // Write a Java program that lists
    // all even numbers from 1 to 100
    // Output: 2, 4, 6, 8, ..., 100

    private static void printEven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (i == end) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int start = 1, end = 100;
        printEven(start, end);
    }
}
