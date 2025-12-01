package abstarction_prac;

abstract public class Animal {

    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract public void makeSound();
}

