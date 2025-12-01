package abstarction_prac;

public class Cat extends Animal{
    
    public Cat(String name){
        super(name);
    }
    
    public void makeSound(){
        System.out.println("The cat "+name+" says : Meow!");
    }
}
