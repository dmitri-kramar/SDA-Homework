package part1.loops;

public class Loops_ex05 {

    // Write a Java program that prints all the powers of a number under 100: 3
    // Output: 3, 9, 27, 81

    private static void printPowers(int num) {
        StringBuilder sb = new StringBuilder();

        if (num != 0 && num != 1) {
            for (int i = 1; Math.pow(num, i) < 100; i++) {
                sb.append((int)Math.pow(num, i)).append(", ");
            }
            System.out.println(sb.substring(0, sb.length() - 2));
        }
    }

    public static void main(String[] args) {
        int num = 3;
        printPowers(num);
    }
}
