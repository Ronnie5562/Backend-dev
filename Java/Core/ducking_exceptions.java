// Refer to throws.md to understand how it works.

class RunAm {
    public void IdeyFear() throws ArrayIndexOutOfBoundsException, ClassNotFoundException
    {
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++){
            nums[i] = i + 1;
        }
        System.out.println(nums);

        System.out.println(Class.forName("RunAm"));
    }
}

class INoFitrunAm {
    public void NoFearGuy() throws ArrayIndexOutOfBoundsException, ClassNotFoundException
    {
        RunAm obj = new RunAm();

        obj.IdeyFear();
    }
}

public class ducking_exceptions {
    public static void main(String[] args){
        INoFitrunAm obj = new INoFitrunAm();

        try {
            obj.NoFearGuy();
        }
        catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Out of range");
        }
        catch (ClassNotFoundException error) {
            System.out.println("Class not found");
        }
        catch (Exception error) {
            System.out.println("Something went wrong");
        }
    }
}
