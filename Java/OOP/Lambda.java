// I learnt the lambda syntax for interfaces in Java
// NOTE - The Lambda Expression only works with a functional Interface. i.e An interface with strictly just one method

@FunctionalInterface
interface Lamborghini {
    void ride();
}

interface Benz {
    int ChargingPrice(int time); // Input Charging time in hours
}

public class Lambda {
    public static void main(String[] args){

        // Normal Anonymous class implementation
        Lamborghini Murcielago = new Lamborghini() {
            public void ride() {
                System.out.println("Ronald Starts Lamborghini Murcielago Engine 💥💥💥.....");
                System.out.println("Driving Lamborghini Murcielago 🚗🚗🚗 .....");
            }
        };
        Murcielago.ride();

        System.out.println();

        // Lambda Expression Implementation ==> This is Syntatic Sugar 😋😋
        Lamborghini Aventador = () -> {
            System.out.println("Ronald Starts Lamborghini Aventador Engine 💥💥💥.....");
            System.out.println("Driving Lamborghini Aventador 🚗🚗🚗 .....");
        };
        Aventador.ride();

        System.out.println();

        Benz CLA = (time) -> time * 5; // Total charging time (in hours) multiplied by $5
        int Amount = CLA.ChargingPrice(10);
        System.out.println("Your total cost of charging is $" + Amount);


    }
}
