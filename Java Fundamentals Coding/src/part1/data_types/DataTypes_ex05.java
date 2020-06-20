package part1.data_types;

public class DataTypes_ex05 {

    // Write a Java program to print the area and perimeter of a circle: radius = 7.5
    // Output: Area = 176.71458676442586; Perimeter = 47.12388980384689

    private static double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 7.5;
        System.out.print("Area = " + calculateArea(radius));
        System.out.print("; Perimeter = " + calculatePerimeter(radius));
    }
}
