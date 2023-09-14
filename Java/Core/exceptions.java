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
        int b = 3;

        solveMath Student = new solveMath();
        int nums[] = new int[5];

        for (int i = 0; i < 5; i++){
            nums[i] = i + 1;
        }

        try
        {
            double result = (double) Student.divide(a, b);
            int arrayNum = nums[4];
            System.out.println(result);
            System.out.println(arrayNum);
        }
        catch (ArithmeticException error)
        {
            System.out.println("You cannot divide with a 0 (zero) as your denominator");
        }
        catch (ArrayIndexOutOfBoundsException error)
        {
            System.out.println("You are trying to get a value from an index that doesn't exist. There highest index in nums is:" + (nums.length - 1));
        }
        catch (Exception error)
        {
            System.out.println("Something went wrong, check your code techbro isonu");
        }

    }
}
