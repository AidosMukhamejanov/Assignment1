public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with radius" + radius;
    }
}