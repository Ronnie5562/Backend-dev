import java.util.ArrayList;
import java.util.List;


public class forEach {
    public static void main(String[] args) {
        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        // Using forEach to print each element
        numbersList.forEach(number -> System.out.println("Number: " + number));
    }
}

// In Java, the forEach method is a default method provided by the Iterable interface. It allows for iteration over elements of a collection and takes a functional interface as an argument. This functional interface is commonly Consumer, which has a method called accept that defines the action to be performed on each element during iteration.

// The reason we can use forEach without explicitly importing Consumer is because functional interfaces like Consumer, Predicate, Function, etc., are part of the java.util.function package, which is automatically imported in modern Java versions. The forEach method, being part of the core Java library, is designed to work seamlessly with these functional interfaces, enabling us to use lambda expressions without explicit imports for functional interfaces.

// In summary, forEach utilizes the Consumer functional interface, which is automatically available in Java through the java.util.function package, allowing for convenient usage of lambda expressions for iterating over collections.