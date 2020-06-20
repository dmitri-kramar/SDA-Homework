package part1.strings;

public class Strings_ex03 {

    // Write  a  Java  program  to  convert  a  given  string  into  lowercase:
    // “THE  QUICK  BROWN  FOX JUMPS OVER THE LAZY DOG”
    // Output: the quick brown fox jumps over the lazy dog

    private static String makeLowerCase(String text) {
        return text.toLowerCase();
    }

    public static void main(String[] args) {
        String text = "THE  QUICK  BROWN  FOX JUMPS OVER THE LAZY DOG";
        System.out.println(makeLowerCase(text));
    }
}
