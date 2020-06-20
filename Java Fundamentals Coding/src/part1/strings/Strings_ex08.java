package part1.strings;

public class Strings_ex08 {

    // Write a java program to compare two strings lexicographically,
    // ignoring case differences: “This is a comparison” equals “THIS is A Comparison”

    private static void compareStrings(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }

    public static void main(String[] args) {
        String str1 = "This is a comparison", str2 = "THIS is A Comparison";
        compareStrings(str1, str2);
    }
}
