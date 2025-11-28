package practice.multilevelInheritance;

public class Person {

    private String Name;
    private int age;

    public Person(){
        this.Name = "";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.Name = name;
        this.age = age;
    }

//    public void setName(String name,int age) {
//        this.Name = name;
//        this.age = age;
//    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name : "+this.Name);
        System.out.println("Age : "+this.age);
    }



}
