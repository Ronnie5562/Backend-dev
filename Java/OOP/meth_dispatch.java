// Parent class: Computer
class Computer {
    void start() {
        System.out.println("Computer is starting...");
    }
    
    void shutdown() {
        System.out.println("Computer is shutting down...");
    }
    
    void displayInfo() {
        System.out.println("This is a computer.");
    }
}

// Child class: Laptop (extends Computer)
class Laptop extends Computer {
    @Override
    void start() {
        System.out.println("Laptop is starting...");
    }
    
    void sleepMode() {
        System.out.println("Laptop is in sleep mode...");
    }
    
    @Override
    void displayInfo() {
        System.out.println("This is a laptop.");
    }
}

public class meth_dispatch {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Laptop(); // Using polymorphism
        
        computer1.start(); // Calls the start() method of Computer class
        computer2.start(); // Calls the start() method of Laptop class (dynamic method dispatch)

        // computer2.sleepMode();
        
        computer1.shutdown(); // Calls the shutdown() method of Computer class
        computer2.shutdown(); // Calls the shutdown() method of Computer class (no override in Laptop)
        
        computer1.displayInfo(); // Calls the displayInfo() method of Computer class
        computer2.displayInfo(); // Calls the displayInfo() method of Laptop class (dynamic method dispatch)
        
        // Uncommenting the line below will result in a compilation error
        // computer2.sleepMode(); // Cannot call sleepMode() on a Computer reference
    }
}
