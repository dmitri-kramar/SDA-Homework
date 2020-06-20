package part1.loops;

public class Loops_ex08 {

    // Write a program that prints the first n prime numbers: n = 4
    // Output: 2, 3, 5, 7


    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrimes(int n) {
        StringBuilder sb = new StringBuilder();
        int num = 2, count = 0;

        do {
            if (isPrime(num)) {
                sb.append(num).append(", ");
                count++;
            }
            num++;
        } while (count != n);

        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public static void main(String[] args) {
        int n = 4;
        printPrimes(n);
    }
}