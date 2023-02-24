// public abstract class Shape {
//     public double height;
//     public double width;
//     public double radius;

//     public void setValues(double height, double width, double radius) {
//         this.height = height;
//         this.width = width;
//         this.radius = radius;
//     }

//     public double getHeight() {
//         return height;
//     }

//     public double getWidth() {
//         return width;
//     }

//     public double getradius() {
//         return radius;
//     }

//     public abstract double calcArea();

//     public void setValues(int i) {
//     }

//     public void setValues(int i, int j) {
//     }
// }

// public class Rectangle extends Shape {
//     public double getArea() {
//         return getHeight() * getWidth();
//     }
// }

// public class Circle extends Shape {

//     public double calcArea() {
//         double pi = 3.14;
//         return (getradius() * getradius()) * pi;
//     }
// } 

// public class EXR {
//     public static void main(String[] args) {
//         Shape shape;

//         Rectangle rect = new Rectangle();

//         shape = rect;
//         shape.setValues(78, 5);

//         System.out.println("Area of rectangle : " + shape.calcArea());

//         Circle c = new Circle();

//         shape = c;

//         shape.setValues(3);

//         System.out.println("Area of triangle : " + shape.calcArea());
//     }
// }