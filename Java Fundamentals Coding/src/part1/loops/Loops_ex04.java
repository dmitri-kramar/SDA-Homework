package part1.loops;

public class Loops_ex04 {

    // Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both
    // Divided by 3 - 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57, 60,
    // 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99
    // Divided by 5 - 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95
    // Divided by 3 & 5 - 15, 30, 45, 60, 75, 90

    private static void printNumbers(int a, int b) {
        StringBuilder sb1 = new StringBuilder("Divided by " + a + " - ");
        StringBuilder sb2 = new StringBuilder("Divided by " + b + " - ");
        StringBuilder sb3 = new StringBuilder("Divided by " + a + " & " + b + " - ");

        for (int i = 1; i < 100; i++) {
            if (i % a == 0) {
                sb1.append(i).append(", ");
            }
        }
        for (int i = 1; i < 100; i++) {
            if (i % b == 0) {
                sb2.append(i).append(", ");
            }
        }
        for (int i = 1; i < 100; i++) {
            if (i % b == 0 && i % a == 0) {
                sb3.append(i).append(", ");
            }
        }

        System.out.println(sb1.substring(0, sb1.length() - 2));
        System.out.println(sb2.substring(0, sb2.length() - 2));
        System.out.println(sb3.substring(0, sb3.length() - 2));
    }

    public static void main(String[] args) {
        int div1 = 3, div2 = 5;
        printNumbers(div1,div2);
    }
}