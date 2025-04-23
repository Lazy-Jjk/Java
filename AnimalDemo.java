class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
    
    public void sound() {
        System.out.println(name + " makes a sound");
    }
}

class Lion extends Animal {
    public Lion() {
        super("Lion");
    }
    
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }
    
    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}

class Tiger extends Animal {
    public Tiger() {
        super("Tiger");
    }
    
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and fish");
    }
    
    @Override
    public void sound() {
        System.out.println("Tiger growls");
    }
}

class Panther extends Animal {
    public Panther() {
        super("Panther");
    }
    
    @Override
    public void eat() {
        System.out.println("Panther eats meat and small animals");
    }
    
    @Override
    public void sound() {
        System.out.println("Panther purrs");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Panther panther = new Panther();
        
        System.out.println("Lion:");
        lion.eat();
        lion.sound();
        
        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        
        System.out.println("\nPanther:");
        panther.eat();
        panther.sound();
    }
} 