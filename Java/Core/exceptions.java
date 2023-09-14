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

public class exceptions {
    public static void main(String[] args){
        int a = 15;
        int b = 0;

        solveMath Student = new solveMath();
        int nums[] = new int[5];

        int arrayNum = 0;
        double result = 0.0;


        try
        {
            result = (double) Student.divide(a, b);

            for (int i = 0; i < 5; i++){
                nums[i] = i + 1;
            }
            arrayNum = nums[4];
        }
        catch (ArithmeticException error)
        {
            System.out.println("You cannot divide with a 0 (zero) as your denominator ==> By default, we will divide it by 1");
            result = (double) Student.divide(a, 1);
        }
        catch (ArrayIndexOutOfBoundsException error)
        {
            System.out.println("You are trying to get / set a value from an index that doesn't exist. There highest index in nums is:" + (nums.length - 1));
        }
        catch (Exception error)
        {
            System.out.println("Something went wrong, check your code techbro isonu");
        }

        System.out.println(result);
        System.out.println(arrayNum);

    }
}
