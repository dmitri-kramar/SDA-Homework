package inheritance.exercise1;

// Create classes Rectangle and Circle.
// Both of them should inherit class Shape.
// Which fields and methods are common?

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}