package part1.data_types;

public class DataTypes_ex07 {

    // Write a Java program to print the area and perimeter of a rectangle:
    // Width = 5.5; Height = 8.5
    // Output: Area = 47.60; Perimeter = 28.20

    private static float calculateArea(float width, float height) {
        return width * height;
    }

    private static float calculatePerimeter(float width, float height) {
        return width * 2 + height * 2;
    }

    public static void main(String[] args) {
        float width = 5.5f, height = 8.5f;
        System.out.print("Area = " + calculateArea(width, height));
        System.out.print("; Perimeter = " + calculatePerimeter(width, height));
    }
}
