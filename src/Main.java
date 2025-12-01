import abstarction_prac.Animal;
import abstarction_prac.Cat;
import abstarction_prac.Dog;
import inheritance_prac.Engineer;
import inheritance_prac.Manager;
import interface_prac.CreditCardPayment;
import interface_prac.PaymentGateway;
import interface_prac.UPIPayment;
import overload_overide.Circle;
import overload_overide.Shape;
import overload_overide.Triangle;
import polyform_prac.ShapeCalculator;
import practice.multilevelInheritance.BoardingStudent;
import static_prac.Counter;

import java.util.Scanner;

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

//        practice.Car c = new practice.Car();
//        c.setColor("Red");
//        c.setSpeed(-10);
//        System.out.println("Color: " + c.getColor());
//        System.out.println("Speed: " + c.getSpeed());
//
//
//        practice.Student s = new practice.Student();
//        s.setDetails("Vinil",116);
//        s.displayDetails();

//          practice.BankAccount b1 = new practice.BankAccount("9662375274869",8655);
//          practice.BankAccount b2 = new practice.BankAccount(b1);
//          b1.deposit(5854);
//          b1.withdraw(9437);
//          b1.displayDetails();
//
//          b2.displayDetails();
//        practice.Rectangle r1 = new practice.Rectangle();
//        r1.calculateArea();
//        r1.displayDetails();
//        practice.Rectangle r2 = new practice.Rectangle(5.0,3.0);
//        r2.calculateArea();
//        r2.displayDetails();


//        List<String> titles = new ArrayList<>(List.of("Java", "Python", "C++"));
//        List<String> authors = new ArrayList<>(List.of("James", "Guido", "Bjarne"));
//        List<Boolean> availability = new ArrayList<>(List.of(true, true, false));
//
//        Book b1 = new Book(titles,authors,availability);
//        b1.borrowBook("Java");
//        b1.getAvailability("Python");


//        Employee emp = new Employee("Vinil", 101, 50000);
//        System.out.println(emp.name);
//        System.out.println(emp.employeeId);
//        System.out.println("Salary : "+String.format("%.2f",emp.getSalary()));
//        emp.setSalary(-55000);
//        emp.setSalary(55000);
//        emp.displayEmployeeDetails();

//        BoardingStudent b = new BoardingStudent("Vinil",23,101,"Masters", 3,"Tanuj");
//        System.out.println(b.getName());
//        b.displayBoardingDetails();

//          Manager m1 = new Manager("Details",101,5);
//          Engineer e1 = new Engineer("Vinil",101,"Backend Developer");
//
//          m1.displayDetails();
//          System.out.println("----------------");
//          e1.displayDetails();

//            Shape s = new Shape();
//            System.out.println("Default Shape Area: " + s.area());
//            System.out.println("Square Area (side=5): " + s.area(5));
//            System.out.println("Rectangle Area (length=4, width=6): " + s.area(4,6));
//
//            Circle c = new Circle(3);
//            System.out.println("Circle Area: " + String.format("%.2f", c.area()));
//
//            Triangle t = new Triangle(4,5);
//            System.out.println("Triangle Area: " + String.format("%.2f", t.area()));

//              ShapeCalculator s = new ShapeCalculator();
//              s.area(3);
//              s.area(2,5);
//              s.area(4,3,5);

//                Animal d = new Dog("Buddy");
//                Animal c = new Cat("Whiskers");
//                d.makeSound();
//                c.makeSound();

//                 PaymentGateway p1 = new CreditCardPayment(284.5);
//                 PaymentGateway p2 = new UPIPayment(2747.2);
//
//                 p1.processPayment();
//                 p2.processPayment();

        Scanner sc = new Scanner(System.in);
         int count = sc.nextInt();
         int start = 0;

         while(start > count){
             Counter c = new Counter();
             start++;
         }
        System.out.println("Number of objects created : "+Counter.getCount());
         sc.close();



    }
}