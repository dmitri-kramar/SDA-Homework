package part1.data_types;

public class DataTypes_ex06 {

    // Write a Java program that takes three numbers as input to calculate
    // and print the average of the numbers: 10, 20, 30
    // Output: Average = 20

    private static int calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        System.out.println("Average = " + calculateAverage(a,b,c));
    }
}
