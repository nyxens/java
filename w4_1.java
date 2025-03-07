import java.util.Scanner;
interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.1415*radius*radius;
    }
}class Triangle implements Shape{
    double base;
    double height;
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }
}
class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length * width;
    }
}

public class w4_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println(circle.calculateArea());
        System.out.print("Enter length and width of the rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length,width);
        System.out.println(rectangle.calculateArea());
        System.out.print("Enter base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base,height);
        System.out.println(triangle.calculateArea());
        scanner.close();
    }
}
