package part1.loops;

public class Loops_ex03 {

    // Write a Java program that accepts an integer (n)
    // and displays n, nn, nnn, nnnn, nnnnnn: 5
    // Output: 5, 55, 555, 5555, 55555

    private static void printPattern(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);
            }
            if (i != 5) System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
}
