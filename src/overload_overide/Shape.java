package overload_overide;

public class Shape {

    public double area(){
        return 0;
    }

    public double area(int side) {
        return side * side;
    }

    public double area(int length, int width) {
        return length * width;
    }
}
