package overload_overide;

public class Shape {

    public int area(){
        return 0;
    }

    public int area(int side){
        return side * side;
    }

    public int area(int length,int width){
        return length * width;
    }
}
