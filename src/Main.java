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


        Employee emp = new Employee("Vinil", 101, 50000);
        System.out.println(emp.name);
        System.out.println(emp.employeeId);
        emp.getSalary();
        emp.setSalary(-55000);
        emp.setSalary(55000);
        emp.displayEmployeeDetails();

    }
}