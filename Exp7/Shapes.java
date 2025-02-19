abstract class Shape {
    public void calculateArea(double l, double r) {

    }

}

class Rectangle extends Shape {
    public Rectangle(double l, double b) {

    }

    @Override
    public void calculateArea(double l, double b) {
        System.out.print(" area of rectangle is : " + l * b);
    }

}

class Circle extends Shape {
    public Circle(double PI, double r) {

    }

    @Override
    public void calculateArea(double PI, double r) {
        System.out.println(" area of circle is : " + PI * r * r);
    }

}

class Shapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.calculateArea(5, 10);

        Circle c = new Circle(3.14, 6);
        c.calculateArea(3.14, 6);

    }
}
