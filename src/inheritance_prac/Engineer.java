package inheritance_prac;

public class Engineer extends Employee{

    private final String specialization;

    public Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Specialization : "+this.specialization);
    }
}
