public class Cylinder {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;    }

    public double SurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);
    }

    public double Volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String toString() {
        return "Cylinder with radius" + radius + "and height" + height;
    }
}