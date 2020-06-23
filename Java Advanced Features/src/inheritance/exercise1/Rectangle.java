package inheritance.exercise1;

// Create classes Rectangle and Circle.
// Both of them should inherit class Shape.
// Which fields and methods are common?

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}