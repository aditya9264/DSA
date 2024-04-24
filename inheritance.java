class Shape {
    String color;


class Triangle extends Shape { 
    public void area(int l, int h) {
        System.out.println(0.5 * l * h); // Area of a triangle formula
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h); // Area of an equilateral triangle formula
    } 
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r); // Area of a circle formula
    }
}
}


public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}

