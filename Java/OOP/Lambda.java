// I learnt the lambda syntax for interfaces in Java


@FunctionalInterface
interface Lamborghini {
    void ride();
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

    }
}
