package part1.loops;

public class Loops_ex01 {

    // Write a Java program that takes a number
    // and prints its multiplication table up to 10: 8
    // Output: 8, 16, 24, 32, ..., 80

    private static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.print(num * i);
            } else {
                System.out.print((num * i) + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int num = 8;
        printMultiplicationTable(num);
    }
}
