import java.util.Scanner;

abstract class Shape {
  abstract void calculateArea();
}

class Circle extends Shape {
  void calculateArea() {
    double area, r;
    System.out.println("Enter radius:");
    Scanner sc = new Scanner(System.in);
    r = sc.nextInt();
    area = 3.14 * r * r;
    System.out.println("Area of circle is : " + area);
  }
}

class Rectangle extends Shape {
  void calculateArea() {
    int len, br, area;
    System.out.println("Enter values for length and breadth: ");
    Scanner sc = new Scanner(System.in);
    len = sc.nextInt();
    br = sc.nextInt();
    area = len * br;
    System.out.println("Area of rectangle is : " + area);
  }
}

public class exp06_02 {

  public static void main(String[] args) {
    Shape obj1 = new Circle();
    Shape obj2 = new Rectangle();
    obj1.calculateArea();
    obj2.calculateArea();
  }

}