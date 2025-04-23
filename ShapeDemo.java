abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double side1;
    private double side2;
    
    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
    
    @Override
    double calculatePerimeter() {
        return base + side1 + side2;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 3, 5, 5);
        
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
} 