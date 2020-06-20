package part1.strings;

public class Strings_ex04 {

    // Write a Java program to reverse a word: “avaJ”
    // Output: Java

    private static String getReversed(StringBuilder sb) {
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("avaJ");
        System.out.println(getReversed(sb));
    }
}
