package shape;

public class f1 {

    public class Circle {
        int r = 10;
        double area;

        public void Calculate_Area() {
            area = 3.14 * r * r;
            System.out.println("Area of circle is: " + area);
        }
    }

    public class Rectangle {
        int len = 10, bre = 10;
        double area;

        public void Calculate_Area() {
            area = len * bre;
            System.out.println("Area of Rectangle is: " + area);
        }
    }
}
