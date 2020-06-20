package part1.strings;

public class Strings_ex06 {

    // Write a Java program to create the concatenation of the two strings
    // except removing the first character of each string. The length of
    // the strings must be 1 and above: “Java” and “Fundamentals”
    // Output: avaundamentals

    private static String removeFirstLetter(String str) {
        return str.substring(1);
    }

    public static void main(String[] args) {
        String str1 = "Java", str2 = "Fundamentals";
        System.out.println(removeFirstLetter(str1) + removeFirstLetter(str2));
    }
}
