package composition;

// Create a Muzzle class.

public class Muzzle {
    private double price;
    private int size;
    private String color;

    public Muzzle(double price, int size, String color) {
        this.price = price;
        this.size = size;
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}