package abstracts.exercise2;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(6.8);
        Rectangle rectangle = new Rectangle(10, 13.5);

        // Verify abstract methods for both Circle and Rectangle classes.

        System.out.println(circle.toString());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea() + "\n");

        System.out.println(rectangle.toString());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Area: " + rectangle.getArea());
    }
}