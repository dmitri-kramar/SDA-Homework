package part1.data_types;

public class DataTypes_ex09 {

    // Write a Java program to compare two numbers and print if they are equal
    // or different, smaller, larger, smaller or equal, larger or equal: 25; 39
    // 25 != 39
    // 25 < 39
    // 25 <= 39

    private static void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " != " + b);
            System.out.println(a + " > " + b);
            System.out.println(a + " >= " + b);
        } else if (a < b) {
            System.out.println(a + " != " + b);
            System.out.println(a + " < " + b);
            System.out.println(a + " <= " + b);
        } else {
            System.out.println(a + " = " + b);
            System.out.println(a + " = " + b);
            System.out.println(a + " <= " + b);
        }
    }

    public static void main(String[] args) {
        int a = 25, b = 39;
        compare(a,b);
    }
}