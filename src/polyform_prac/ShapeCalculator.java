package polyform_prac;

public class ShapeCalculator {

    public void area(int radius){
        System.out.println("Area of Circle : "+(int)(3.14 * radius * radius));
    }

    public void area(int length, int width){
        System.out.println("Area of Rectangle : "+(length * width));
    }

    public void area(int base1, int base2, int height){
        System.out.println("Area of Trapezoid : "+((base1 + base2) * height) / 2);
    }
}
