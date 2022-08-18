package HomeWork2;

public class Main {
    public static void main(String[] args) {
        Squar squar = new Squar(5);
        System.out.println("Square perimeter: " + squar.getPerimeter());

        Triangle triangle = new Triangle(15, 15, 15);
        System.out.println("Triangle perimeter: "+triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(20, 45, 40, 30);
        System.out.println("Rectangle perimeter: "+rectangle.getPerimeter());

        Rhombus rhombus = new Rhombus(30, 50, 40, 20);
        System.out.println("Rhombus perimeter: "+rhombus.getPerimeter());

        Cirle cirle = new Cirle(15);
        System.out.println("Circles perimeter: " + cirle.getPerimeter());
    }
}
