package inheritance_prac;

public class Employee {

    private String name;
    private int id;

    public Employee(String name,int id){
        this.name = name;
        this.id = id;
    }

    public void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Id : "+this.id);
    }
}
