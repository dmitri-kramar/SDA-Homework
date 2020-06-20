package part1.strings;

public class Strings_ex10 {

    // Write a Java program to count the letters, spaces, numbers
    // and other characters of an input string: “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33”
    // Output: 23 letters, 9 spaces, 8 numbers, 6 others

    private static int[] countEverything(String str) {
        int[] results = new int[4];
        for (int el : str.toCharArray()) {
            if (Character.isLetter(el)) {
                results[0]++;
            } else if (Character.isSpaceChar(el)) {
                results[1]++;
            } else if (Character.isDigit(el)) {
                results[2]++;
            } else {
                results[3]++;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        String str = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        int[] count = countEverything(str);
        System.out.print(count[0] + " letters, " + count[1] + " spaces, ");
        System.out.print(count[2] + " numbers, " + count[3] + " others");
    }
}
