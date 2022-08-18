package HomeWork2;

public class Cirle extends Shape{
    private double r;
    private double PI = 3.14;

    public Cirle(double r) {
        this.r = r;
    }
    @Override
    public double getPerimeter() {
        return 2*PI*r;
    }
}
