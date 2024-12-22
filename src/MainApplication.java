import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = scanner.nextDouble();

        System.out.println("Enter radius and height");
        double rradius = scanner.nextDouble();
        double height = scanner.nextDouble();

        Circle circle = new Circle(radius);
        Cylinder cylinder = new Cylinder(rradius, height);

        System.out.println("Circumference of cirlce: " + circle.Circumference());
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Surface area of cylinder: " + cylinder.SurfaceArea());
        System.out.println("Volume of cylinder: " + cylinder.Volume());
    }
}
