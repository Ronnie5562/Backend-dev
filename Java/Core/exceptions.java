/*
 * Exception are basically runtime errors.
 * In Java, the Exception class inherits from another class called Throwable. ==> Fun fact: Most keywords in java that ends eith the suffix "able" are interfaces, but Throwable is an actaul class and not an interface
 */

@FunctionalInterface
interface doMath {
    int divide(int a, int b);
}

class solveMath implements doMath{
    public int divide(int a, int b){
        return a / b;
    }
}

// Custom Exception class
class RonaldException extends Exception {
    public RonaldException(String str) {
        super(str);
    }
}

public class exceptions {
    public static void main(String[] args){
        int a = 17;
        int b = 1;

        solveMath Student = new solveMath();
        int nums[] = new int[5];

        int arrayNum = 0;
        double result = 0.0;


        try
        {
            result = (double) Student.divide(a, b);
            if (result == 0) throw new ArithmeticException(); // Manualy triggers the catch block with `ArithmeticException` exception
            else if (result == 17) throw new RonaldException("Don't you ever dare make a calculation that has a result of my age in 2023");

            for (int i = 0; i < 5; i++){
                nums[i] = i + 1;
            }
            arrayNum = nums[4];
        }
        catch (RonaldException error)
        {
            System.out.println(error);
        }
        catch (ArithmeticException error)
        {
            System.out.print("The default value is: ");
            result = (double) Student.divide(a, 1);
        }
        catch (ArrayIndexOutOfBoundsException error)
        {
            System.out.println("You are trying to get / set a value from an index that doesn't exist. There highest index in nums is:" + (nums.length - 1));
        }
        catch (Exception error)
        {
            System.out.println("Something went wrong," + error);
            System.out.println(" Check your code. Techbro isonu");
        }

        System.out.println("Division result: " + result);
        System.out.println("Array Indexing result: " + arrayNum);

    }
}
