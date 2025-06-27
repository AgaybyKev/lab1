

public class Tire {
    private String brand;
    private double size;
    private double gripRating;

    public Tire(String brand, double size, double gripRating) {
        this.brand = brand;
        this.size = size;
        this.gripRating = gripRating;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public double getGripRating() {
        return gripRating;
    }

    @Override
    public String toString() {
        return "Tire [Brand: " + brand + ", Size: " + size + " inches, Grip Rating: " + gripRating + "]";
    }
}