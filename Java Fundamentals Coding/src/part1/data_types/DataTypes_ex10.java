package part1.data_types;

public class DataTypes_ex10 {

    // Write a Java program to compute the sum of the digits of an integer: 133
    // Output: 7

    private static int sumDigits(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int result = 0;
        for (char el : digits) {
            result += Character.getNumericValue(el);
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 133;
        System.out.println(sumDigits(num));
    }
}