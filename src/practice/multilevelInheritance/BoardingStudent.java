package practice.multilevelInheritance;

public class BoardingStudent extends Student{

    private int roomNumber;
    private String hostelName;

    public BoardingStudent() {
        this.roomNumber = 0;
        this.hostelName = "";
    }

    public BoardingStudent(int studentId, String grade, int roomNumber, String hostelName) {
        super(studentId, grade);
        this.roomNumber = roomNumber;
        this.hostelName = hostelName;
    }

    public BoardingStudent(String Name, int age, int studentId, String grade, int roomNumber, String hostelName) {
        super(Name,age,studentId,grade);
        this.roomNumber = roomNumber;
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public void displayBoardingDetails(){
        super.displayStudentDetails();
        System.out.println("Room Number : "+this.roomNumber);
        System.out.println("Hostel Name : "+this.hostelName);
    }
}
