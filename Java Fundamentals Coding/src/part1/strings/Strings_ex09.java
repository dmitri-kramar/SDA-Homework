package part1.strings;

public class Strings_ex09 {

    // Write a Java program to check whether a given string ends
    // with the contents of another string: “Java exercises” ends with “ses”

    private static boolean checkIfEndsWith(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public static void main(String[] args) {
        String str1 = "Java exercises", str2 = "ses";
        System.out.println("\"" + str1 + "\" ends with \"" + str2 + "\": " + checkIfEndsWith(str1, str2));
    }
}
