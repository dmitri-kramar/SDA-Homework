package abstracts.exercise2;

// Change Shape class to be abstract.

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Add getPerimeter and getArea methods declaration
    // to the Shape abstract class.

    public abstract double getPerimeter();
    public abstract double getArea();
}