package exceptions.exercise2;

// What do you think about raising an exception: when should
// we raise an exception and when return Null on method "failure"?
// Try to implement one method for each situation.

public class Main {

    private static String getFirstLetter(String str) {
        if (str == null) {
            return "Variable is set to " + null + ".";
        } else if (str.isEmpty() || str.isBlank()) {
            throw new IllegalArgumentException();
        } else {
            return str.replaceAll("\\s+", "").substring(0, 1);
        }
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(getFirstLetter(str));
    }
}