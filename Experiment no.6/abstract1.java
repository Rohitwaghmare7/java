import java.util.*;

abstract class Shape {
    abstract void Calculate_Area();
}

class Circle extends Shape {
    void Calculate_Area() {
        double area, r;
        System.out.println("Enter Radius: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        area = 3.14 * r * r;
        System.out.println("Area of circle is: " + area);
    }
}

class Rectangle extends Shape {
    void Calculate_Area() {
        int area, len, bre;
        System.out.println("Enter values for length and breadth: ");
        Scanner sc = new Scanner(System.in);
        len = sc.nextInt();
        bre = sc.nextInt();
        area = len * bre;
        System.out.println("Area of rectangle is: " + area);
    }
}

public class abstract1 {
    public static void main(String[] args) {
        Shape obj1 = new Circle();
        Shape obj2 = new Rectangle();
        obj1.Calculate_Area();
        obj2.Calculate_Area();
    }
}