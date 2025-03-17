import java.util.Scanner;

public class ShapeArea {

    public static double area(double length, double width) {
        return length * width;
    }

    public static double area(int  side) {
        return side * side;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(float base, float height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose a shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.println("Area of Rectangle: " + area(length, width));
                break;
            case 2:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                System.out.println("Area of Square: " + area(side));
                break;
            case 3:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of Circle: " + area(radius));
                break;
            case 4:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.println("Area of Triangle: " + area(base, height));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}