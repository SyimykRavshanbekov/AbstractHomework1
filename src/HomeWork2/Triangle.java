package HomeWork2;

public class Triangle extends Shape{
    private int x;
    private int y;
    private int z;

    public Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public double getPerimeter() {
        return x+y+z;
    }
}
