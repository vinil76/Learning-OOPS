import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        Car c = new Car();
//        c.setColor("Red");
//        c.setSpeed(-10);
//        System.out.println("Color: " + c.getColor());
//        System.out.println("Speed: " + c.getSpeed());
//
//
//        Student s = new Student();
//        s.setDetails("Vinil",116);
//        s.displayDetails();

//          BankAccount b1 = new BankAccount("9662375274869",8655);
//          BankAccount b2 = new BankAccount(b1);
//          b1.deposit(5854);
//          b1.withdraw(9437);
//          b1.displayDetails();
//
//          b2.displayDetails();
//        Rectangle r1 = new Rectangle();
//        r1.calculateArea();
//        r1.displayDetails();
//        Rectangle r2 = new Rectangle(5.0,3.0);
//        r2.calculateArea();
//        r2.displayDetails();


        List<String> titles = new ArrayList<>(List.of("Java", "Python", "C++"));
        List<String> authors = new ArrayList<>(List.of("James", "Guido", "Bjarne"));
        List<Boolean> availability = new ArrayList<>(List.of(true, true, false));

        Book b1 = new Book(titles,authors,availability);
        b1.borrowBook("Java");
        b1.getAvailability("Python");


    }
}