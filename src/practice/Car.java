package practice;

public class Car {
    String color;
    int speed;

    public void setSpeed(int speed){
        if(speed >= 0){
            this.speed = speed;
        }else{
            System.out.println("Invalid Speed");
        }
    }

    public int getSpeed(){
        return speed;
    }
    public void setColor(String color){
        this.color  = color;
    }

    public String getColor(){
        return color;
    }


}
