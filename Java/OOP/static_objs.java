// Static attributes (variables and methods) in java are just like class attributes in python
// They are shared by all objects of that particular class

class Car {
    String brand;
    String model;
    int year;
    String color;
    // Here is one static variable
    static String Vehicle = "Car";

    public void describe(){
        System.out.println(brand + " : " + model + " : " + year + " : " + color);
    }
}


public class static_objs {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Y";
        car1.year = 2020;
        car1.color = "Blue";
        car1.describe();

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Camry";
        car2.year = 2017;
        car2.color = "Red";
        car2.describe();

        Car car3 = new Car();
        car3.brand = "Lamborghini";
        car3.model = " EVO Spyder";
        car3.year = 2021;
        car3.color = "Violet";
        car3.describe();


        System.out.println(); 
        System.out.println("Vehice:  " + Car.Vehicle);
    }
}
