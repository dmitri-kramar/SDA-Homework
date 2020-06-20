package part1.loops;

public class Loops_ex10 {

    // Write a java program to calculate the factorial value of given number: n=5
    // Output: 120 (1*2*3*4*5)

    private static void printFactorial(int n) {
        StringBuilder sb = new StringBuilder();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
            sb.append(i).append("*");
        }

        System.out.println(result + " (" + sb.deleteCharAt(sb.length() - 1) + ")");
    }

    public static void main(String[] args) {
        int n = 5;
        printFactorial(n);
    }
}