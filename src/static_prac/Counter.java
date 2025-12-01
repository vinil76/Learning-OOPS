package static_prac;

public class Counter {

    public static int count = 0;

    public Counter(){
        count += 1;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount() {
        Counter.count = 0;
    }

}
