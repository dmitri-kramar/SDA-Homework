package part1.loops;

public class Loops_ex07 {

    // Write a Java program to print the following:

    private static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPyramid(n);
    }
}
