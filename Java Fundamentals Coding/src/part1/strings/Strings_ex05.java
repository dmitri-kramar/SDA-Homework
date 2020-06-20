package part1.strings;

public class Strings_ex05 {

    // Write a Java program to extract the first half of a string of even length: “Programmer”
    // Output: Progr

    private static String getHalf(String word) {
        return word.substring(0, word.length() / 2);
    }

    public static void main(String[] args) {
        String word = "Programmer";
        System.out.println(getHalf(word));
    }
}
