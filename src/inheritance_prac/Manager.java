package inheritance_prac;

public class Manager extends Employee{

    private final int teamSize;

    public Manager(String Name, int id, int teamSize) {
        super(Name,id);
        this.teamSize = teamSize;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size : "+this.teamSize);
    }
}
