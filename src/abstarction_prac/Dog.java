package abstarction_prac;

public class Dog extends Animal {
    
    public Dog(String name) {
        super(name);
    }
    public void makeSound(){
        System.out.println("The dog "+name+" says : Woof!");
    }
}
