// In Java, the primitive types (i.e int, double, char) all have a wrapper class that makes them usable in OOP.
// The wrapper class are Integer, Double e.t.c

public class wrapper_class {
   
    public static void main(String[] args){
        String num = "12";

        // The below will not work because we cannot typecast an obj to a primitive type. and that's where wrapper classes come in - they help us bridge the gap.
        // int num1 = (int) num;

        // We can do this instead
        int num2 = Integer.parseInt(num);

        System.out.println(num2 * 5);

    }
}
