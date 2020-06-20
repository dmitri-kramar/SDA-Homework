package part1.loops;

public class Loops_ex06 {

    // Write a Java program to print Fibonacci series of n terms: 10
    // Output: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    private static void printFibonacci(int n) {
        int n1 = 0, n2 = 1, n3;
        StringBuilder sb = new StringBuilder(n1 + ", " + n2 + ", ");

        for (int i = 2; i < n; i++) {
            n3 = n1+n2;
            sb.append(n3).append(", ");
            n1 = n2;
            n2 = n3;
        }

        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}
