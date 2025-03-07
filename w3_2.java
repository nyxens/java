// abstract class GeometricShape {
//     public abstract double area();
//     public abstract double perimeter();
// }
// class Triangle extends GeometricShape{
//     double height;
//     double base;
//     double side1,side2,side3;
//     public Triangle(double height,double base,double side1,double side2,double side3){
//         this.height =height;
//         this.base = base;
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }
//     public double area(){
//         return 0.5*base*height;
//     }
//     public double perimeter(){
//         return side1+side2+side3;
//     }
// }
// class Square extends GeometricShape{
//     double side;
//     public Square(double side){
//         this.side = side;
//     }
//     public double area(){
//         return side*side;
//     }
//     public double perimeter(){
//         return 4*side;
//     }
// }
// class Circle extends GeometricShape{
//     double radius;
//     public Circle(double radius){
//         this.radius =radius;
//     }
//     public double area(){
//         return 3.1415*radius*radius;
//     }
//     public double perimeter(){
//         return 2*3.1415*radius;
//     }
// }

// public class w3_2 {
//     public static void main(String[] args) {
//         Triangle triangle = new Triangle(3, 4, 6, 7, 8);
//         Square square = new Square(5);
//         Circle circle = new Circle(6);
//         System.out.println("the area of triangle is : "+triangle.area());
//         System.out.println("the perimeter of triangle is : "+triangle.perimeter());
//         System.out.println("the area of square is : "+square.area());
//         System.out.println("the perimeter of square is : "+square.perimeter());
//         System.out.println("the area of circle is : "+circle.area());
//         System.out.println("the perimeter of circle is : "+circle.perimeter());
//     }
// }
