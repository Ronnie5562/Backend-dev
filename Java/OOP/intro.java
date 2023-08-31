class Calculator {
    // A calculator class

    public int add(int num1, int num2) {
        return (num1 + num2);
    }

    public int sub(int num1, int num2) {
        return (num1 - num2);
    }

    public int mul(int num1, int num2) {
        return (num1 * num2);
    }

    public float div(int num1, int num2) {
        return ((float)num1 / (float)num2);
    }

    public int mod(int num1, int num2) {
        return (num1 % num2);
    }
}

public class intro {
    // Intro to OOP in Java
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int num1 = 15;
        int num2 = 4;

        int sum = calculator.add(num1, num2);
        System.out.println("Sum: " + sum);

        int difference = calculator.sub(num1, num2);
        System.out.println("Difference: " + difference);

        int product = calculator.mul(num1, num2);
        System.out.println("Product: " + product);

        float quotient = calculator.div(num1, num2);
        System.out.println("Quotient: " + quotient);

        int remainder = calculator.mod(num1, num2);
        System.out.println("Remainder: " + remainder);
    }
}
