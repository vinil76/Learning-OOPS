public class Employee {

    public String name;
    protected int employeeId;
    private double salary;

    public Employee(){
        this.name = "";
        this.employeeId = 0;
        this.salary = 0.0;
    }

    public  Employee(String name,int employeeId,double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Invalid salary");
            this.salary = 0.0;
        }else{
            this.salary = salary;
        }
    }

    public void getSalary(){
        System.out.println("Salary : "+ String.format("%.2f",this.salary));
    }

    public void displayEmployeeDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Employee Id : "+this.employeeId);
        System.out.println("Salary : "+ String.format("%.2f",this.salary));
    }
}
