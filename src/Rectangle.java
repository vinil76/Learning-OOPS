public class Rectangle {

    private final double length;
    private final double width;
    private double area;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
        this.area = 0.0;
    }

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        area = length * width;
    }
    public void displayDetails(){
        System.out.println("Length : "+ String.format("%.2f",this.length));
        System.out.println("Width : "+ String.format("%.2f",this.width));
        System.out.println("Area : "+ String.format("%.2f",this.area));
    }
}
