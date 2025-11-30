package overload_overide;

public class Triangle extends Shape{

    private final double length;
    private final double width;

    public Triangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
        return (length * width) / 2;
    }
}
