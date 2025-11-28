package practice.multilevelInheritance;

public class Student extends Person {

    private int studentId;
    private String grade;

    public Student() {
        this.studentId = 0;
        this.grade = "";
    }

    public Student(String name, int age, int studentId, String grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public Student(int studentId, String grade) {
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void displayStudentDetails(){
        super.displayPersonDetails();
        System.out.println("Student ID : "+this.studentId);
        System.out.println("Grade : "+this.grade);
    }
}
