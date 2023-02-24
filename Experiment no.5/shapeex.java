
class Shape {                 //Rohit waghmare  roll no :213;        
    void draw() {
        System.out.println("Draw shaps");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("length = 10 and width =20");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("radius is 10cm");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Angles are 30 ,60 ,90");
    }
}

class shapeex {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}