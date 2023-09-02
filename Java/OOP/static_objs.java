// Static attributes (variables and methods) in java are just like class attributes in python
// They are shared by all objects of that particular class

class Car {
    String brand;
    String model;
    int year;
    String color;
    String staffName; // This variable holds the name of the staff that added that particular car object to our database.
    // Here is one static variable
    static String Vehicle = "Car";

    public void describe(){
        System.out.println(brand + " : " + model + " : " + year + " : " + color);
    }

    // Let's create a static method now - Note that a static variable or method can only be accessed by a Class and not objects of that class.
    public static void admindescribe(Car obj) {
        System.out.println("The " + obj.brand + " model " + obj.model + " of year " + obj.year + " was added to our database by " + obj.staffName);
    }
}


public class static_objs {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.model = "Y";
        car1.year = 2020;
        car1.color = "Blue";
        car1.staffName = "Jackson";
        car1.describe();

        Car car2 = new Car();
        car2.brand = "Toyota";
        car2.model = "Camry";
        car2.year = 2017;
        car2.color = "Red";
        car2.staffName = "Caicedo";
        car2.describe();

        Car car3 = new Car();
        car3.brand = "Lamborghini";
        car3.model = " EVO Spyder";
        car3.year = 2021;
        car3.color = "Violet";
        car3.staffName = "Eddy";
        car3.describe();


        System.out.println();
        System.out.println("Vehice:  " + Car.Vehicle);
        System.out.println();
        Car.admindescribe(car1);
        Car.admindescribe(car2);
        Car.admindescribe(car3);
    }
}
