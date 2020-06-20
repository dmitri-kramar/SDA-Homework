package part1.loops;

public class Loops_ex09 {

    // Write a program that prints the first n numbers, with an n increment: n=4
    // Output: 4, 8, 12, 16

    private static void printNumbers(int n) {
        StringBuilder sb = new StringBuilder();
        int num = 0, count = 0;

        do {
            num += n;
            sb.append(num).append(", ");
            count++;
        } while (count != n);

        System.out.println(sb.substring(0, sb.length() - 2));
    }

    public static void main(String[] args) {
        int n = 4;
        printNumbers(n);
    }
}
