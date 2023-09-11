# Dynamic Method Dispatch in Java

In Java, dynamic method dispatch is a mechanism that allows you to determine which method gets called at runtime based on the actual type of the object, rather than the reference type. This feature is essential for achieving polymorphism and method overriding in object-oriented programming.

## Example Code

```java
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

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Laptop(); // Using polymorphism
        
        computer1.start(); // Calls the start() method of Computer class
        computer2.start(); // Calls the start() method of Laptop class (dynamic method dispatch)
        
        computer1.shutdown(); // Calls the shutdown() method of Computer class
        computer2.shutdown(); // Calls the shutdown() method of Computer class (no override in Laptop)
        
        computer1.displayInfo(); // Calls the displayInfo() method of Computer class
        computer2.displayInfo(); // Calls the displayInfo() method of Laptop class (dynamic method dispatch)
        
        // Uncommenting the line below will result in a compilation error
        // computer2.sleepMode(); // Cannot call sleepMode() on a Computer reference
    }
}
```

# Explanation

In this Java code example, we have two classes: `Computer` and `Laptop`. `Laptop` is a subclass of `Computer`, which means it inherits the `start()`, `shutdown()`, and `displayInfo()` methods from the `Computer` class. However, the `Laptop` class overrides the `start()` and `displayInfo()` methods with its own implementations.

In the `Main` class, we create two objects, `computer1` and `computer2`. `computer1` is of type `Computer`, and `computer2` is of type `Laptop`. This demonstrates polymorphism in Java, where you can use a reference of the parent class to refer to an object of the child class.

Now, when we call the `start()` method on `computer1`, it calls the `start()` method of the `Computer` class, and it prints "Computer is starting...". When we call the `start()` method on `computer2`, it calls the `start()` method of the `Laptop` class because it is referring to an actual `Laptop` object, and it prints "Laptop is starting...".

This behavior is an example of dynamic method dispatch. The method that gets called is determined at runtime based on the actual type of the object, not the reference type. Similarly, calling other methods like `shutdown()` and `displayInfo()` demonstrates this dynamic dispatch.

However, trying to call `computer2.sleepMode()` will result in a compilation error because the `sleepMode()` method is specific to the `Laptop` class and cannot be called using a reference of the parent class (`Computer`).

Dynamic method dispatch is a powerful feature in Java that enables flexibility and extensibility in object-oriented programming, allowing you to write more generic code that can work with different subclasses of a parent class.
