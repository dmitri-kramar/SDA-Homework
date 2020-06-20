package part1.data_types;

public class DataTypes_ex08 {

    // Write a Java program to swap two variables: a = 5; b = 13
    // Output: a = 13; b = 5;

    public static void main(String[] args) {
        int a = 5, b = 13, c;
        System.out.println("Before swap: a = " + a + "; b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After swap: a = " + a + "; b = " + b);
    }
}
